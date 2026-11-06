package e2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class a0 {
    public static final a0 i = new a0(new z());
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

    public a0(z zVar) {
        this.a = h2.m0.h0(zVar.a);
        this.c = h2.m0.h0(zVar.b);
        this.b = zVar.a;
        this.d = zVar.b;
        this.e = zVar.c;
        this.f = zVar.d;
        this.g = zVar.e;
        this.h = zVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.b == a0Var.b && this.d == a0Var.d && this.e == a0Var.e && this.f == a0Var.f && this.g == a0Var.g && this.h == a0Var.h;
    }

    public final int hashCode() {
        long j3 = this.b;
        int i7 = ((int) (j3 ^ (j3 >>> 32))) * 31;
        long j10 = this.d;
        return ((((((((i7 + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
