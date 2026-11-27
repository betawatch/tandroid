// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hd3 extends jd3 implements Comparable {
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

    public hd3(int i, t1c t1cVar, int i2, gd3 gd3Var, int i3, String str, String str2) {
        super(i, t1cVar, i2);
        int i4;
        boolean z = false;
        this.f = qu6.c(i3, false);
        int i5 = this.d.e;
        int i6 = gd3Var.C;
        j99 j99Var = gd3Var.y;
        int i7 = i5 & (~i6);
        this.h = (i7 & 1) != 0;
        this.n = (i7 & 2) != 0;
        j99 u = str2 != null ? po5.u(str2) : j99Var.isEmpty() ? po5.u("") : j99Var;
        int i8 = 0;
        while (true) {
            if (i8 >= u.d) {
                i4 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = ld3.g(this.d, (String) u.get(i8), gd3Var.D);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.r = i8;
        this.s = i4;
        int i9 = str2 != null ? 1088 : gd3Var.A;
        int i10 = this.d.f;
        eu7 eu7Var = ld3.l;
        int bitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i10 & i9) : Integer.MAX_VALUE;
        this.w = bitCount;
        ko4 ko4Var = this.d;
        this.E = (ko4Var.f & 1088) != 0;
        int f = ld3.f(ko4Var, gd3Var.z);
        this.x = f;
        int g = ld3.g(this.d, str, ld3.h(str) == null);
        this.y = g;
        boolean z2 = i4 > 0 || (j99Var.isEmpty() && bitCount > 0) || ((j99Var.isEmpty() && f != Integer.MAX_VALUE) || this.h || ((this.n && g > 0) || gd3Var.x));
        if (qu6.c(i3, gd3Var.B0) && z2) {
            z = true;
        }
        this.e = z;
    }

    @Override // jd3
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override // jd3
    public final boolean b(jd3 jd3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(hd3 hd3Var) {
        pp2 c = pp2.a.c(this.f, hd3Var.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(hd3Var.r);
        pk7 pk7Var = pk7.b;
        pk7 pk7Var2 = pk7.c;
        pp2 b = c.b(valueOf, valueOf2, pk7Var2);
        int i = hd3Var.s;
        int i2 = this.s;
        pp2 a = b.a(i2, i);
        int i3 = hd3Var.w;
        int i4 = this.w;
        pp2 c2 = a.a(i4, i3).b(Integer.valueOf(this.x), Integer.valueOf(hd3Var.x), pk7Var2).c(this.h, hd3Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(hd3Var.n);
        if (i2 != 0) {
            pk7Var = pk7Var2;
        }
        pp2 a2 = c2.b(valueOf3, valueOf4, pk7Var).a(this.y, hd3Var.y);
        if (i4 == 0) {
            a2 = a2.d(this.E, hd3Var.E);
        }
        return a2.e();
    }
}
