package f3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final x b;
    public final d0 c;

    public a(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new x(4);
                this.c = new d0(-1, -1, "image/webp");
                break;
            default:
                this.b = new x(4);
                this.c = new d0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        switch (this.a) {
            case 0:
                l lVar = (l) pVar;
                lVar.v(4, false);
                x xVar = this.b;
                xVar.K(4);
                lVar.j(xVar.a, 0, 4, false);
                if (xVar.C() == 1718909296) {
                    xVar.K(4);
                    lVar.j(xVar.a, 0, 4, false);
                    if (xVar.C() == 1635150182) {
                    }
                }
                break;
            default:
                x xVar2 = this.b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.j(xVar2.a, 0, 4, false);
                if (xVar2.C() == 1380533830) {
                    lVar2.v(4, false);
                    xVar2.K(4);
                    lVar2.j(xVar2.a, 0, 4, false);
                    if (xVar2.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // c3.o
    public final o b() {
        int i10 = this.a;
        return this;
    }

    @Override // c3.o
    public final void c(q qVar) {
        switch (this.a) {
            case 0:
                this.c.c(qVar);
                break;
            default:
                this.c.c(qVar);
                break;
        }
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        switch (this.a) {
            case 0:
                this.c.d(j10, j11);
                break;
            default:
                this.c.d(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // c3.o
    public final List e() {
        switch (this.a) {
        }
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.c.f(pVar, sVar);
    }

    @Override // c3.o
    public final void release() {
        int i10 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
