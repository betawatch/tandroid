package k3;

import b2.w;
import b2.w0;
import b2.x;
import c3.d0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.b = new d0(65496, 2, "image/jpeg");
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
                j0 F1 = qVar.F1(0, 3);
                qVar.D1(new t(-9223372036854775807L));
                qVar.Q0();
                x xVar = (x) this.b;
                w a2 = xVar.a();
                a2.r = w0.n("text/x-unknown");
                a2.j = xVar.s;
                ic.a.u(a2, F1);
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
        g0 g0Var = i0.b;
        return s1.e;
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

    public a(x xVar) {
        this.b = xVar;
    }

    private final void g() {
    }

    private final void h(long j10, long j11) {
    }
}
