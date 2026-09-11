package f3;

import c3.d0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final v b;
    public final d0 c;

    public a(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new v(4);
                this.c = new d0(-1, -1, "image/heif");
                break;
            case 2:
                this.b = new v(4);
                this.c = new d0(-1, -1, "image/webp");
                break;
            default:
                this.b = new v(4);
                this.c = new d0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        switch (this.a) {
            case 0:
                l lVar = (l) pVar;
                lVar.v(4, false);
                v vVar = this.b;
                vVar.G(4);
                lVar.j(vVar.a, 0, 4, false);
                if (vVar.z() == 1718909296) {
                    vVar.G(4);
                    lVar.j(vVar.a, 0, 4, false);
                    if (vVar.z() == 1635150182) {
                    }
                }
                break;
            case 1:
                l lVar2 = (l) pVar;
                lVar2.v(4, false);
                v vVar2 = this.b;
                vVar2.G(4);
                lVar2.j(vVar2.a, 0, 4, false);
                if (vVar2.z() == 1718909296) {
                    vVar2.G(4);
                    lVar2.j(vVar2.a, 0, 4, false);
                    if (vVar2.z() == 1751476579) {
                    }
                }
                break;
            default:
                v vVar3 = this.b;
                vVar3.G(4);
                l lVar3 = (l) pVar;
                lVar3.j(vVar3.a, 0, 4, false);
                if (vVar3.z() == 1380533830) {
                    lVar3.v(4, false);
                    vVar3.G(4);
                    lVar3.j(vVar3.a, 0, 4, false);
                    if (vVar3.z() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // c3.o
    public final o c() {
        int i10 = this.a;
        return this;
    }

    @Override // c3.o
    public final void g(q qVar) {
        switch (this.a) {
            case 0:
                this.c.g(qVar);
                break;
            case 1:
                this.c.g(qVar);
                break;
            default:
                this.c.g(qVar);
                break;
        }
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        switch (this.a) {
            case 0:
                this.c.h(j3, j10);
                break;
            case 1:
                this.c.h(j3, j10);
                break;
            default:
                this.c.h(j3, j10);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // c3.o
    public final List i() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.c.m(pVar, sVar);
    }

    @Override // c3.o
    public final void release() {
        int i10 = this.a;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
