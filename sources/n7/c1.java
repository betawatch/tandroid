package n7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c1 implements Comparable {
    public static int c(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static c1 d(byte... bArr) {
        bArr.getClass();
        e1 e1Var = new e1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.k(e1Var);
        } finally {
            try {
                e1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final c1 b(Class cls) {
        if (cls.isInstance(this)) {
            return (c1) cls.cast(this);
        }
        throw new b1(c3.i0.n("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
