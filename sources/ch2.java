// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ch2 {
    public final sc0 a;
    public final wxb b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public ch2(int i, sc0 sc0Var, wxb wxbVar, boolean z) {
        int i2 = sc0Var.d;
        this.a = sc0Var;
        this.f = z;
        int a = sc0Var.a();
        boolean z2 = true;
        if (a != 1 && a != 2) {
            z2 = false;
        }
        gre.f(z2);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = sc0Var.b * 1000000;
        long j2 = sc0Var.c;
        String str = g8c.a;
        this.e = g8c.b0(i2, j, j2, RoundingMode.DOWN);
        this.b = wxbVar;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i2;
    }

    public final hv9 a(int i) {
        return new hv9((this.e / this.g) * this.o[i], this.n[i]);
    }

    public final ev9 b(long j) {
        if (this.l == 0) {
            hv9 hv9Var = new hv9(0L, this.m);
            return new ev9(hv9Var, hv9Var);
        }
        int i = (int) (j / (this.e / this.g));
        int e = g8c.e(this.o, i, true, true);
        if (this.o[e] == i) {
            hv9 a = a(e);
            return new ev9(a, a);
        }
        hv9 a2 = a(e);
        int i2 = e + 1;
        return i2 < this.n.length ? new ev9(a2, a(i2)) : new ev9(a2, a2);
    }
}
