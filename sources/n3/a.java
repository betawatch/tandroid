package n3;

import e2.s0;
import e2.u;
import f3.e0;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(int i7) {
        if ((i7 & 1) != 0) {
            this.b = new e0(65496, 2, "image/jpeg");
        } else {
            this.b = new b();
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
                return ((o) this.b).b(pVar);
            default:
                return true;
        }
    }

    @Override // f3.o
    public final void c(q qVar) {
        switch (this.a) {
            case 0:
                ((o) this.b).c(qVar);
                break;
            default:
                j0 O1 = qVar.O1(0, 3);
                qVar.f(new t(-9223372036854775807L));
                qVar.U0();
                u uVar = (u) this.b;
                e2.t a10 = uVar.a();
                a10.r = s0.n("text/x-unknown");
                a10.j = uVar.s;
                f1.s(a10, O1);
                break;
        }
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        switch (this.a) {
            case 0:
                ((o) this.b).d(j3, j10);
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
            case 0:
                return ((o) this.b).f(pVar, sVar);
            default:
                return pVar.skip(ConnectionsManager.DEFAULT_DATACENTER_ID) == -1 ? -1 : 0;
        }
    }

    @Override // f3.o
    public final void release() {
        switch (this.a) {
            case 0:
                ((o) this.b).release();
                break;
        }
    }

    public a(u uVar) {
        this.b = uVar;
    }

    private final void g() {
    }

    private final void h(long j3, long j10) {
    }
}
