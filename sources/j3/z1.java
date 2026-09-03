package j3;

import java.util.Arrays;
import k7.b7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z1 implements g {
    public final Object a;
    public final int b;
    public final c1 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long h;
    public final int n;
    public final int r;

    static {
        int i10 = h5.d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public z1(Object obj, int i10, c1 c1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.a = obj;
        this.b = i10;
        this.c = c1Var;
        this.d = obj2;
        this.e = i11;
        this.f = j10;
        this.h = j11;
        this.n = i12;
        this.r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z1.class == obj.getClass()) {
            z1 z1Var = (z1) obj;
            if (this.b == z1Var.b && this.e == z1Var.e && this.f == z1Var.f && this.h == z1Var.h && this.n == z1Var.n && this.r == z1Var.r && b7.a(this.a, z1Var.a) && b7.a(this.d, z1Var.d) && b7.a(this.c, z1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.h), Integer.valueOf(this.n), Integer.valueOf(this.r)});
    }
}
