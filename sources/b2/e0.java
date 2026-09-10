package b2;

import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e0 {
    public static final e0 f = new e0(new d0());
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
        String str = e2.d0.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.a;
        long j10 = d0Var.b;
        long j11 = d0Var.c;
        float f7 = d0Var.d;
        float f10 = d0Var.e;
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = f7;
        this.e = f10;
    }

    public final d0 a() {
        d0 d0Var = new d0();
        d0Var.a = this.a;
        d0Var.b = this.b;
        d0Var.c = this.c;
        d0Var.d = this.d;
        d0Var.e = this.e;
        return d0Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f;
        long j3 = e0Var.a;
        long j10 = this.a;
        if (j10 != j3) {
            bundle.putLong(g, j10);
        }
        long j11 = e0Var.b;
        long j12 = this.b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.c;
        long j14 = this.c;
        if (j14 != j13) {
            bundle.putLong(i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(j, f10);
        }
        float f11 = e0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(k, f12);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a == e0Var.a && this.b == e0Var.b && this.c == e0Var.c && this.d == e0Var.d && this.e == e0Var.e;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.b;
        int i10 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        float f7 = this.d;
        int floatToIntBits = (i11 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f10 = this.e;
        return floatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
