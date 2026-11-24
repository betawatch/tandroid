// default package

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class bq7 {
    public static final Logger a = Logger.getLogger(bq7.class.getName());
    public static final HashMap b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(qa3.class);
        hashSet.add(hq9.class);
        hashSet.add(rg0.class);
        hashSet.add(h84.class);
        hashSet.add(aq7.class);
        hashSet.add(it8.class);
        hashSet.add(y40.class);
        hashSet.add(i84.class);
        hashSet.add(st3.class);
        hashSet.add(ha3.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            kf3 kf3Var = (kf3) cls.getAnnotation(kf3.class);
            int[] tags = kf3Var.tags();
            int objectTypeIndication = kf3Var.objectTypeIndication();
            Map map = (Map) b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static rg0 a(int i, ByteBuffer byteBuffer) {
        rg0 r7cVar;
        int i2 = jne.i(byteBuffer);
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(i2));
        Logger logger = a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(i2) + " found: " + cls);
            r7cVar = new r7c();
        } else {
            try {
                r7cVar = (rg0) cls.newInstance();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + i2, (Throwable) e);
                rjb.m(e);
                return null;
            }
        }
        r7cVar.a = i2;
        int a2 = jne.a(byteBuffer.get());
        r7cVar.b = a2 & nm7.K1;
        int i3 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = jne.a(byteBuffer.get());
            i3++;
            r7cVar.b = (r7cVar.b << 7) | (a2 & nm7.K1);
        }
        r7cVar.c = i3;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(r7cVar.b);
        r7cVar.b(slice);
        byteBuffer.position(byteBuffer.position() + r7cVar.b);
        return r7cVar;
    }
}
