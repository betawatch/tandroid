// default package

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class jke implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static jke d(byte... bArr) {
        bArr.getClass();
        yke ykeVar = new yke(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return c7f.a(ykeVar);
        } finally {
            try {
                ykeVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final jke b(Class cls) {
        if (cls.isInstance(this)) {
            return (jke) cls.cast(this);
        }
        throw new zje(qd4.q("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public int zza() {
        return c(Byte.MIN_VALUE);
    }
}
