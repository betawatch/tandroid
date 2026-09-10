package k3;

import b2.r;
import b2.r0;
import b2.s;
import c3.d0;
import c3.h0;
import c3.o;
import c3.p;
import c3.q;
import c3.t;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public final boolean b(p pVar) {
        switch (this.a) {
            case 0:
                return ((o) this.b).b(pVar);
            default:
                return true;
        }
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
                ((o) this.b).g(qVar);
                break;
            default:
                h0 I = qVar.I(0, 3);
                qVar.G(new t(-9223372036854775807L));
                qVar.B();
                s sVar = (s) this.b;
                r a2 = sVar.a();
                a2.q = r0.n("text/x-unknown");
                a2.j = sVar.r;
                hc.b.u(a2, I);
                break;
        }
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        switch (this.a) {
            case 0:
                ((o) this.b).h(j3, j10);
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
    public final int m(p pVar, c3.s sVar) {
        switch (this.a) {
            case 0:
                return ((o) this.b).m(pVar, sVar);
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

    public a(s sVar) {
        this.b = sVar;
    }

    private final void a() {
    }

    private final void d(long j3, long j10) {
    }
}
