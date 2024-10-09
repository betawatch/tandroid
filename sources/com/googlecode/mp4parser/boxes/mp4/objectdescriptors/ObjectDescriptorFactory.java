package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class ObjectDescriptorFactory {
    protected static Logger log = Logger.getLogger(ObjectDescriptorFactory.class.getName());
    protected static Map descriptorRegistry = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet();
        hashSet.add(DecoderSpecificInfo.class);
        hashSet.add(SLConfigDescriptor.class);
        hashSet.add(BaseDescriptor.class);
        hashSet.add(ExtensionDescriptor.class);
        hashSet.add(ObjectDescriptorBase.class);
        hashSet.add(ProfileLevelIndicationDescriptor.class);
        hashSet.add(AudioSpecificConfig.class);
        hashSet.add(ExtensionProfileLevelDescriptor.class);
        hashSet.add(ESDescriptor.class);
        hashSet.add(DecoderConfigDescriptor.class);
        for (Class cls : hashSet) {
            Descriptor descriptor = (Descriptor) cls.getAnnotation(Descriptor.class);
            int[] tags = descriptor.tags();
            int objectTypeIndication = descriptor.objectTypeIndication();
            Map map = (Map) descriptorRegistry.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            descriptorRegistry.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static BaseDescriptor createFrom(int i, ByteBuffer byteBuffer) {
        BaseDescriptor unknownDescriptor;
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        Map map = (Map) descriptorRegistry.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) descriptorRegistry.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(readUInt8));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            log.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(readUInt8) + " found: " + cls);
            unknownDescriptor = new UnknownDescriptor();
        } else {
            try {
                unknownDescriptor = (BaseDescriptor) cls.newInstance();
            } catch (Exception e) {
                log.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + readUInt8, (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        unknownDescriptor.parse(readUInt8, byteBuffer);
        return unknownDescriptor;
    }
}
