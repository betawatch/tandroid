package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class y0 implements g {
    public static final z0 f = new z0(new x0());
    public static final String h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final d0 w;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        int i10 = f5.d0.a;
        h = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new d0(4);
    }

    public y0(x0 x0Var) {
        this.a = x0Var.a;
        this.b = x0Var.b;
        this.c = x0Var.c;
        this.d = x0Var.d;
        this.e = x0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a == y0Var.a && this.b == y0Var.b && this.c == y0Var.c && this.d == y0Var.d && this.e == y0Var.e;
    }

    public final int hashCode() {
        long j10 = this.a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.b;
        return ((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }
}
