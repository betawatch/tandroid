// default package

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ic3 implements e84 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ic3() {
        this.a = (byte) 1;
        this.b = new zh7(peb.B, 16);
    }

    @Override // e84
    public final e84 a() {
        switch (this.a) {
            case 0:
                return this;
            default:
                return (zh7) this.b;
        }
    }

    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        switch (this.a) {
            case 0:
                return ((cb3) f84Var).k(ConnectionsManager.DEFAULT_DATACENTER_ID) != -1 ? 0 : -1;
            default:
                return ((zh7) this.b).b(f84Var, v11Var);
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((zh7) this.b).c(f84Var);
        }
    }

    @Override // e84
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((zh7) this.b).d(j, j2);
                break;
        }
    }

    @Override // e84
    public final List e() {
        switch (this.a) {
            case 0:
                no5 no5Var = po5.b;
                return j99.e;
            default:
                return ((zh7) this.b).m;
        }
    }

    @Override // e84
    public final void f(g84 g84Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                x1c e0 = g84Var.e0(0, 3);
                g84Var.m0(new qc0(-9223372036854775807L));
                g84Var.D();
                ko4 ko4Var = (ko4) obj;
                jo4 a = ko4Var.a();
                a.s = eg7.n("text/x-unknown");
                a.k = ko4Var.t;
                xnb.v(a, e0);
                break;
            default:
                ((zh7) obj).f(new j09((Object) g84Var, (byte) 8));
                break;
        }
    }

    @Override // e84
    public final void release() {
        byte b = this.a;
    }

    public ic3(ko4 ko4Var) {
        this.a = (byte) 0;
        this.b = ko4Var;
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(long j, long j2) {
    }
}
