package j3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class t0 implements g {
    public static final u0 f = new u0(new s0());
    public static final String h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final q0 w;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        int i10 = h5.d0.a;
        h = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new q0(1);
    }

    public t0(s0 s0Var) {
        this.a = s0Var.a;
        this.b = s0Var.b;
        this.c = s0Var.c;
        this.d = s0Var.d;
        this.e = s0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b && this.c == t0Var.c && this.d == t0Var.d && this.e == t0Var.e;
    }

    public final int hashCode() {
        long j10 = this.a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.b;
        return ((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }
}
