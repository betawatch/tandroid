package n7;

import com.google.android.gms.internal.vision.e2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class e1 implements Comparable {
    public static int c(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static e1 d(byte... bArr) {
        bArr.getClass();
        g1 g1Var = new g1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.k(g1Var);
        } finally {
            try {
                g1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final e1 b(Class cls) {
        if (cls.isInstance(this)) {
            return (e1) cls.cast(this);
        }
        throw new d1(e2.j("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
