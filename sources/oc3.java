// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oc3 extends qc3 implements Comparable {
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

    public oc3(int i, sxb sxbVar, int i2, nc3 nc3Var, int i3, String str, String str2) {
        super(i, sxbVar, i2);
        int i4;
        boolean z = false;
        this.f = ls6.c(i3, false);
        int i5 = this.d.e;
        int i6 = nc3Var.C;
        w59 w59Var = nc3Var.y;
        int i7 = i5 & (~i6);
        this.h = (i7 & 1) != 0;
        this.n = (i7 & 2) != 0;
        w59 u = str2 != null ? mm5.u(str2) : w59Var.isEmpty() ? mm5.u("") : w59Var;
        int i8 = 0;
        while (true) {
            if (i8 >= u.d) {
                i4 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = sc3.g(this.d, (String) u.get(i8), nc3Var.D);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.r = i8;
        this.s = i4;
        int i9 = str2 != null ? 1088 : nc3Var.A;
        int i10 = this.d.f;
        yq7 yq7Var = sc3.l;
        int bitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i10 & i9) : Integer.MAX_VALUE;
        this.w = bitCount;
        fm4 fm4Var = this.d;
        this.E = (fm4Var.f & 1088) != 0;
        int f = sc3.f(fm4Var, nc3Var.z);
        this.x = f;
        int g = sc3.g(this.d, str, sc3.h(str) == null);
        this.y = g;
        boolean z2 = i4 > 0 || (w59Var.isEmpty() && bitCount > 0) || ((w59Var.isEmpty() && f != Integer.MAX_VALUE) || this.h || ((this.n && g > 0) || nc3Var.x));
        if (ls6.c(i3, nc3Var.B0) && z2) {
            z = true;
        }
        this.e = z;
    }

    @Override // qc3
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override // qc3
    public final boolean b(qc3 qc3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(oc3 oc3Var) {
        wo2 c = wo2.a.c(this.f, oc3Var.f);
        Integer valueOf = Integer.valueOf(this.r);
        Integer valueOf2 = Integer.valueOf(oc3Var.r);
        hi7 hi7Var = hi7.b;
        hi7 hi7Var2 = hi7.c;
        wo2 b = c.b(valueOf, valueOf2, hi7Var2);
        int i = oc3Var.s;
        int i2 = this.s;
        wo2 a = b.a(i2, i);
        int i3 = oc3Var.w;
        int i4 = this.w;
        wo2 c2 = a.a(i4, i3).b(Integer.valueOf(this.x), Integer.valueOf(oc3Var.x), hi7Var2).c(this.h, oc3Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(oc3Var.n);
        if (i2 != 0) {
            hi7Var = hi7Var2;
        }
        wo2 a2 = c2.b(valueOf3, valueOf4, hi7Var).a(this.y, oc3Var.y);
        if (i4 == 0) {
            a2 = a2.d(this.E, oc3Var.E);
        }
        return a2.e();
    }
}
