package m3;

import d2.u;
import d2.u0;
import d2.v;
import e3.d0;
import e3.i0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g9.g0;
import g9.s1;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(int i3) {
        if ((i3 & 1) != 0) {
            this.b = new d0(65496, 2, "image/jpeg");
        } else {
            this.b = new b();
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
                return ((o) this.b).b(pVar);
            default:
                return true;
        }
    }

    @Override // e3.o
    public final void c(q qVar) {
        switch (this.a) {
            case 0:
                ((o) this.b).c(qVar);
                break;
            default:
                i0 i02 = qVar.i0(0, 3);
                qVar.f(new t(-9223372036854775807L));
                qVar.L();
                v vVar = (v) this.b;
                u a10 = vVar.a();
                a10.r = u0.n("text/x-unknown");
                a10.j = vVar.s;
                f1.w(a10, i02);
                break;
        }
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        switch (this.a) {
            case 0:
                ((o) this.b).d(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // e3.o
    public final List e() {
        switch (this.a) {
        }
        g0 g0Var = g9.i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
            case 0:
                return ((o) this.b).f(pVar, sVar);
            default:
                return pVar.skip(ConnectionsManager.DEFAULT_DATACENTER_ID) == -1 ? -1 : 0;
        }
    }

    @Override // e3.o
    public final void release() {
        switch (this.a) {
            case 0:
                ((o) this.b).release();
                break;
        }
    }

    public a(v vVar) {
        this.b = vVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
