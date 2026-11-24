// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class be3 extends de3 implements Comparable {
    public final boolean E;
    public final boolean e;
    public final boolean f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public be3(int i, uzb uzbVar, int i2, ae3 ae3Var, int i3, String str, String str2) {
        super(i, uzbVar, i2);
        int i4;
        boolean z = false;
        this.f = kt6.c(i3, false);
        int i5 = this.d.e;
        int i6 = ae3Var.C;
        y79 y79Var = ae3Var.y;
        int i7 = i5 & (~i6);
        this.h = (i7 & 1) != 0;
        this.n = (i7 & 2) != 0;
        y79 u = str2 != null ? mo5.u(str2) : y79Var.isEmpty() ? mo5.u("") : y79Var;
        int i8 = 0;
        while (true) {
            if (i8 >= u.d) {
                i4 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = fe3.g(this.d, (String) u.get(i8), ae3Var.D);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.r = i8;
        this.s = i4;
        int i9 = str2 != null ? 1088 : ae3Var.A;
        int i10 = this.d.f;
        at7 at7Var = fe3.l;
        int bitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i10 & i9) : Integer.MAX_VALUE;
        this.w = bitCount;
        go4 go4Var = this.d;
        this.E = (go4Var.f & 1088) != 0;
        int f = fe3.f(go4Var, ae3Var.z);
        this.x = f;
        int g = fe3.g(this.d, str, fe3.h(str) == null);
        this.y = g;
        boolean z2 = i4 > 0 || (y79Var.isEmpty() && bitCount > 0) || ((y79Var.isEmpty() && f != Integer.MAX_VALUE) || this.h || ((this.n && g > 0) || ae3Var.x));
        if (kt6.c(i3, ae3Var.B0) && z2) {
            z = true;
        }
        this.e = z;
    }

    @Override // de3
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override // de3
    public final boolean b(de3 de3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(be3 be3Var) {
        hq2 c = hq2.a.c(this.f, be3Var.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(be3Var.r);
        jk7 jk7Var = jk7.b;
        jk7 jk7Var2 = jk7.c;
        hq2 b = c.b(valueOf, valueOf2, jk7Var2);
        int i = be3Var.s;
        int i2 = this.s;
        hq2 a = b.a(i2, i);
        int i3 = be3Var.w;
        int i4 = this.w;
        hq2 c2 = a.a(i4, i3).b(Integer.valueOf(this.x), Integer.valueOf(be3Var.x), jk7Var2).c(this.h, be3Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(be3Var.n);
        if (i2 != 0) {
            jk7Var = jk7Var2;
        }
        hq2 a2 = c2.b(valueOf3, valueOf4, jk7Var).a(this.y, be3Var.y);
        if (i4 == 0) {
            a2 = a2.d(this.E, be3Var.E);
        }
        return a2.e();
    }
}
