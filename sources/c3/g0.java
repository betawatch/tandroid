package c3;

import b2.v0;
import e9.x1;
import i2.o1;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class g0 implements q {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public s f;
    public l0 g;

    public g0(int i10, int i11, String str) {
        this.a = i10;
        this.b = i11;
        this.c = str;
    }

    @Override // c3.q
    public final boolean a(r rVar) {
        int i10 = this.b;
        int i11 = this.a;
        u6.p((i11 == -1 || i10 == -1) ? false : true);
        e2.x xVar = new e2.x(i10);
        ((l) rVar).j(xVar.a, 0, i10, false);
        return xVar.H() == i11;
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.f = sVar;
        l0 j02 = sVar.j0(1024, 4);
        this.g = j02;
        b2.v vVar = new b2.v();
        String str = this.c;
        vVar.q = v0.n(str);
        vVar.r = v0.n(str);
        o1.v(vVar, j02);
        this.f.C();
        this.f.g0(new h0());
        this.e = 1;
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        if (j10 == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // c3.q
    public final List e() {
        e9.l0 l0Var = e9.n0.b;
        return x1.e;
    }

    @Override // c3.q
    public final int f(r rVar, u uVar) {
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        l0 l0Var = this.g;
        l0Var.getClass();
        int a2 = l0Var.a(rVar, 1024, true);
        if (a2 != -1) {
            this.d += a2;
            return 0;
        }
        this.e = 2;
        this.g.c(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // c3.q
    public final q b() {
        return this;
    }

    @Override // c3.q
    public final void release() {
    }
}
