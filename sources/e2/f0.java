package e2;

import android.os.Bundle;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 f = new f0(new e0());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = h2.m0.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.a;
        long j10 = e0Var.b;
        long j11 = e0Var.c;
        float f10 = e0Var.d;
        float f11 = e0Var.e;
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = f10;
        this.e = f11;
    }

    public final e0 a() {
        e0 e0Var = new e0();
        e0Var.a = this.a;
        e0Var.b = this.b;
        e0Var.c = this.c;
        e0Var.d = this.d;
        e0Var.e = this.e;
        return e0Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f;
        long j3 = f0Var.a;
        long j10 = this.a;
        if (j10 != j3) {
            bundle.putLong(g, j10);
        }
        long j11 = f0Var.b;
        long j12 = this.b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.c;
        long j14 = this.c;
        if (j14 != j13) {
            bundle.putLong(i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(j, f11);
        }
        float f12 = f0Var.e;
        float f13 = this.e;
        if (f13 != f12) {
            bundle.putFloat(k, f13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && this.b == f0Var.b && this.c == f0Var.c && this.d == f0Var.d && this.e == f0Var.e;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.b;
        int i7 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.c;
        int i10 = (i7 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.e;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
