package h3;

import e3.d0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final y b;
    public final d0 c;

    public a(int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new y(4);
                this.c = new d0(-1, -1, "image/webp");
                break;
            default:
                this.b = new y(4);
                this.c = new d0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // e3.o
    public final o a() {
        int i3 = this.a;
        return this;
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        switch (this.a) {
            case 0:
                l lVar = (l) pVar;
                lVar.w(4, false);
                y yVar = this.b;
                yVar.K(4);
                lVar.h(yVar.a, 0, 4, false);
                if (yVar.C() == 1718909296) {
                    yVar.K(4);
                    lVar.h(yVar.a, 0, 4, false);
                    if (yVar.C() == 1635150182) {
                    }
                }
                break;
            default:
                y yVar2 = this.b;
                yVar2.K(4);
                l lVar2 = (l) pVar;
                lVar2.h(yVar2.a, 0, 4, false);
                if (yVar2.C() == 1380533830) {
                    lVar2.w(4, false);
                    yVar2.K(4);
                    lVar2.h(yVar2.a, 0, 4, false);
                    if (yVar2.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // e3.o
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

    @Override // e3.o
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
    @Override // e3.o
    public final List e() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.c.f(pVar, sVar);
    }

    @Override // e3.o
    public final void release() {
        int i3 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
