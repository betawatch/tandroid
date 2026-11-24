// default package

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bd3 implements s84 {
    public final /* synthetic */ byte a;
    public final Object b;

    public bd3() {
        this.a = (byte) 1;
        this.b = new sh7(tcb.B, 16);
    }

    @Override // s84
    public final s84 a() {
        switch (this.a) {
            case 0:
                return this;
            default:
                return (sh7) this.b;
        }
    }

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        switch (this.a) {
            case 0:
                return ((vb3) t84Var).l(ConnectionsManager.DEFAULT_DATACENTER_ID) != -1 ? 0 : -1;
            default:
                return ((sh7) this.b).b(t84Var, u21Var);
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((sh7) this.b).c(t84Var);
        }
    }

    @Override // s84
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((sh7) this.b).d(j, j2);
                break;
        }
    }

    @Override // s84
    public final List e() {
        switch (this.a) {
            case 0:
                ko5 ko5Var = mo5.b;
                return y79.e;
            default:
                return ((sh7) this.b).m;
        }
    }

    @Override // s84
    public final void f(u84 u84Var) {
        byte b = this.a;
        Object obj = this.b;
        byte b2 = 3;
        switch (b) {
            case 0:
                yzb c0 = u84Var.c0(0, 3);
                u84Var.f0(new od0(-9223372036854775807L));
                u84Var.B();
                go4 go4Var = (go4) obj;
                fo4 a = go4Var.a();
                a.s = wf7.n("text/x-unknown");
                a.k = go4Var.t;
                mlb.w(a, c0);
                break;
            default:
                ((sh7) obj).f(new cf9(u84Var, b2));
                break;
        }
    }

    @Override // s84
    public final void release() {
        byte b = this.a;
    }

    public bd3(go4 go4Var) {
        this.a = (byte) 0;
        this.b = go4Var;
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(long j, long j2) {
    }
}
