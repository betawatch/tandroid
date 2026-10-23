package k3;

import b2.v0;
import b2.w;
import c3.g0;
import c3.l0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c3.v;
import e9.n0;
import e9.x1;
import i2.o1;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class a implements q {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.b = new g0(65496, 2, "image/jpeg");
        } else {
            this.b = new b();
        }
    }

    @Override // c3.q
    public final boolean a(r rVar) {
        switch (this.a) {
            case 0:
                return ((q) this.b).a(rVar);
            default:
                return true;
        }
    }

    @Override // c3.q
    public final q b() {
        int i10 = this.a;
        return this;
    }

    @Override // c3.q
    public final void c(s sVar) {
        switch (this.a) {
            case 0:
                ((q) this.b).c(sVar);
                break;
            default:
                l0 j02 = sVar.j0(0, 3);
                sVar.g0(new v(-9223372036854775807L));
                sVar.C();
                w wVar = (w) this.b;
                b2.v a2 = wVar.a();
                a2.r = v0.n("text/x-unknown");
                a2.j = wVar.s;
                o1.v(a2, j02);
                break;
        }
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        switch (this.a) {
            case 0:
                ((q) this.b).d(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // c3.q
    public final List e() {
        switch (this.a) {
        }
        e9.l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.q
    public final int f(r rVar, u uVar) {
        switch (this.a) {
            case 0:
                return ((q) this.b).f(rVar, uVar);
            default:
                return rVar.skip(ConnectionsManager.DEFAULT_DATACENTER_ID) == -1 ? -1 : 0;
        }
    }

    @Override // c3.q
    public final void release() {
        switch (this.a) {
            case 0:
                ((q) this.b).release();
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
