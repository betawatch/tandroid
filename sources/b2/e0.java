package b2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class e0 {
    public static final e0 i = new e0(new d0());
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

    public e0(d0 d0Var) {
        this.a = e2.l0.h0(d0Var.a);
        this.c = e2.l0.h0(d0Var.b);
        this.b = d0Var.a;
        this.d = d0Var.b;
        this.e = d0Var.c;
        this.f = d0Var.d;
        this.g = d0Var.e;
        this.h = d0Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.b == e0Var.b && this.d == e0Var.d && this.e == e0Var.e && this.f == e0Var.f && this.g == e0Var.g && this.h == e0Var.h;
    }

    public final int hashCode() {
        long j10 = this.b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.d;
        return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
