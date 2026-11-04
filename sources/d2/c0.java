package d2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class c0 {
    public static final c0 i = new c0(new b0());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public c0(b0 b0Var) {
        this.a = g2.n0.h0(b0Var.a);
        this.c = g2.n0.h0(b0Var.b);
        this.b = b0Var.a;
        this.d = b0Var.b;
        this.e = b0Var.c;
        this.f = b0Var.d;
        this.g = b0Var.e;
        this.h = b0Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.b == c0Var.b && this.d == c0Var.d && this.e == c0Var.e && this.f == c0Var.f && this.g == c0Var.g && this.h == c0Var.h;
    }

    public final int hashCode() {
        long j10 = this.b;
        int i3 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.d;
        return ((((((((i3 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
