package org.telegram.tgnet;

import android.graphics.ColorSpace;

/* loaded from: classes3.dex */
public class TLEnum {

    public interface Constructor {
        int getConstructor();

        void serializeToStream(OutputSerializedData outputSerializedData);

        public abstract /* synthetic */ class -CC {
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <E:Ljava/lang/Enum<TE;>;:Lorg/telegram/tgnet/TLEnum$Constructor;>(Ljava/lang/Class<TE;>;IZ)TE; */
    public static Enum TLdeserialize(Class cls, int i, boolean z) {
        Enum fromConstructor = fromConstructor(cls, i);
        if (fromConstructor != null) {
            return fromConstructor;
        }
        if (z) {
            throw new RuntimeException(String.format("can't parse magic %x in %s", Integer.valueOf(i), cls.getName()));
        }
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: <E:Ljava/lang/Enum<TE;>;:Lorg/telegram/tgnet/TLEnum$Constructor;>(Ljava/lang/Class<TE;>;I)TE; */
    /* JADX WARN: Multi-variable type inference failed */
    public static Enum fromConstructor(Class cls, int i) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == 0) {
            return null;
        }
        for (ColorSpace.Named named : enumArr) {
            if (((Constructor) named).getConstructor() == i) {
                return named;
            }
        }
        return null;
    }
}
