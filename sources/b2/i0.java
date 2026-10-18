package b2;

import android.os.Bundle;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class i0 {
    public static final i0 f = new i0(new h0());
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
        String str = e2.m0.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public i0(h0 h0Var) {
        long j10 = h0Var.a;
        long j11 = h0Var.b;
        long j12 = h0Var.c;
        float f7 = h0Var.d;
        float f10 = h0Var.e;
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = f7;
        this.e = f10;
    }

    public final h0 a() {
        h0 h0Var = new h0();
        h0Var.a = this.a;
        h0Var.b = this.b;
        h0Var.c = this.c;
        h0Var.d = this.d;
        h0Var.e = this.e;
        return h0Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        i0 i0Var = f;
        long j10 = i0Var.a;
        long j11 = this.a;
        if (j11 != j10) {
            bundle.putLong(g, j11);
        }
        long j12 = i0Var.b;
        long j13 = this.b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = i0Var.c;
        long j15 = this.c;
        if (j15 != j14) {
            bundle.putLong(i, j15);
        }
        float f7 = i0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(j, f10);
        }
        float f11 = i0Var.e;
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && this.b == i0Var.b && this.c == i0Var.c && this.d == i0Var.d && this.e == i0Var.e;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.c;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f7 = this.d;
        int floatToIntBits = (i11 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f10 = this.e;
        return floatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
