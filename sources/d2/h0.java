package d2;

import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 {
    public static final h0 f = new h0(new g0());
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
        String str = g2.n0.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public h0(g0 g0Var) {
        long j10 = g0Var.a;
        long j11 = g0Var.b;
        long j12 = g0Var.c;
        float f10 = g0Var.d;
        float f11 = g0Var.e;
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = f10;
        this.e = f11;
    }

    public final g0 a() {
        g0 g0Var = new g0();
        g0Var.a = this.a;
        g0Var.b = this.b;
        g0Var.c = this.c;
        g0Var.d = this.d;
        g0Var.e = this.e;
        return g0Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        h0 h0Var = f;
        long j10 = h0Var.a;
        long j11 = this.a;
        if (j11 != j10) {
            bundle.putLong(g, j11);
        }
        long j12 = h0Var.b;
        long j13 = this.b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = h0Var.c;
        long j15 = this.c;
        if (j15 != j14) {
            bundle.putLong(i, j15);
        }
        float f10 = h0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(j, f11);
        }
        float f12 = h0Var.e;
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
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d && this.e == h0Var.e;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        int i3 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.c;
        int i10 = (i3 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.d;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.e;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
