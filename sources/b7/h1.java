package b7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class h1 implements Comparable {
    public static int c(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static h1 d(byte... bArr) {
        bArr.getClass();
        j1 j1Var = new j1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return b.k(j1Var);
        } finally {
            try {
                j1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final h1 b(Class cls) {
        if (cls.isInstance(this)) {
            return (h1) cls.cast(this);
        }
        throw new g1(e2.c.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
