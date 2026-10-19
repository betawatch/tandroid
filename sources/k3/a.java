package k3;

import b2.v;
import b2.v0;
import b2.w;
import c3.e0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.e;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.b = new e0(65496, 2, "image/jpeg");
        } else {
            this.b = new b();
        }
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        switch (this.a) {
            case 0:
                return ((o) this.b).a(pVar);
            default:
                return true;
        }
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
                ((o) this.b).c(qVar);
                break;
            default:
                j0 j02 = qVar.j0(0, 3);
                qVar.g0(new t(-9223372036854775807L));
                qVar.H();
                w wVar = (w) this.b;
                v a2 = wVar.a();
                a2.r = v0.n("text/x-unknown");
                a2.j = wVar.s;
                e.u(a2, j02);
                break;
        }
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        switch (this.a) {
            case 0:
                ((o) this.b).d(j10, j11);
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
            case 0:
                return ((o) this.b).f(pVar, sVar);
            default:
                return pVar.skip(ConnectionsManager.DEFAULT_DATACENTER_ID) == -1 ? -1 : 0;
        }
    }

    @Override // c3.o
    public final void release() {
        switch (this.a) {
            case 0:
                ((o) this.b).release();
                break;
        }
    }

    public a(w wVar) {
        this.b = wVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
