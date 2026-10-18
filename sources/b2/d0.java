package b2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class d0 {
    public static final d0 i = new d0(new c0());
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

    public d0(c0 c0Var) {
        this.a = e2.m0.h0(c0Var.a);
        this.c = e2.m0.h0(c0Var.b);
        this.b = c0Var.a;
        this.d = c0Var.b;
        this.e = c0Var.c;
        this.f = c0Var.d;
        this.g = c0Var.e;
        this.h = c0Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.b == d0Var.b && this.d == d0Var.d && this.e == d0Var.e && this.f == d0Var.f && this.g == d0Var.g && this.h == d0Var.h;
    }

    public final int hashCode() {
        long j10 = this.b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.d;
        return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
