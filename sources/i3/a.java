package i3;

import f3.e0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final x b;
    public final e0 c;

    public a(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = new x(4);
                this.c = new e0(-1, -1, "image/webp");
                break;
            default:
                this.b = new x(4);
                this.c = new e0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // f3.o
    public final o a() {
        int i7 = this.a;
        return this;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        switch (this.a) {
            case 0:
                l lVar = (l) pVar;
                lVar.v(4, false);
                x xVar = this.b;
                xVar.K(4);
                lVar.k(xVar.a, 0, 4, false);
                if (xVar.C() == 1718909296) {
                    xVar.K(4);
                    lVar.k(xVar.a, 0, 4, false);
                    if (xVar.C() == 1635150182) {
                    }
                }
                break;
            default:
                x xVar2 = this.b;
                xVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.k(xVar2.a, 0, 4, false);
                if (xVar2.C() == 1380533830) {
                    lVar2.v(4, false);
                    xVar2.K(4);
                    lVar2.k(xVar2.a, 0, 4, false);
                    if (xVar2.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // f3.o
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

    @Override // f3.o
    public final void d(long j3, long j10) {
        switch (this.a) {
            case 0:
                this.c.d(j3, j10);
                break;
            default:
                this.c.d(j3, j10);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // f3.o
    public final List e() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.c.f(pVar, sVar);
    }

    @Override // f3.o
    public final void release() {
        int i7 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
