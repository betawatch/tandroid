package e3;

import b8.zb;
import d2.u0;
import g9.s1;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 implements o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public q f;
    public i0 g;

    public d0(int i3, int i10, String str) {
        this.a = i3;
        this.b = i10;
        this.c = str;
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        int i3 = this.b;
        int i10 = this.a;
        zb.p((i10 == -1 || i3 == -1) ? false : true);
        g2.y yVar = new g2.y(i3);
        ((l) pVar).h(yVar.a, 0, i3, false);
        return yVar.H() == i10;
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.f = qVar;
        i0 i02 = qVar.i0(1024, 4);
        this.g = i02;
        d2.u uVar = new d2.u();
        String str = this.c;
        uVar.q = u0.n(str);
        uVar.r = u0.n(str);
        f1.w(uVar, i02);
        this.f.L();
        this.f.f(new e0());
        this.e = 1;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        if (j10 == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // e3.o
    public final List e() {
        g9.g0 g0Var = g9.i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(p pVar, s sVar) {
        int i3 = this.e;
        if (i3 != 1) {
            if (i3 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        i0 i0Var = this.g;
        i0Var.getClass();
        int a10 = i0Var.a(pVar, 1024, true);
        if (a10 != -1) {
            this.d += a10;
            return 0;
        }
        this.e = 2;
        this.g.d(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
