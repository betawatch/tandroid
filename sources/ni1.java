// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ni1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij1 b;

    public /* synthetic */ ni1(ij1 ij1Var, byte b) {
        this.a = b;
        this.b = ij1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                m01.u(ij1Var.getContext(), ob6.M0(2131748158, null));
                break;
            case 1:
                m01.u(ij1Var.getContext(), ob6.M0(2131748124, null));
                break;
            case 2:
                q9c q9cVar = ij1Var.X0;
                if (q9cVar != null) {
                    boolean z = ij1Var.f0;
                    q9cVar.g3.O((ij1Var.R0 != -1) == ij1Var.a1.a());
                    if (z && ij1Var.R0 != -1) {
                        ij1Var.a();
                        break;
                    }
                }
                break;
            case 3:
                ij1Var.k1 = ij1Var.j1;
                break;
            case 4:
                ij1Var.J0.setLoading(false);
                break;
            case 5:
                ij1Var.Y0.setVisibility(8);
                break;
            case 6:
                ij1Var.Y0.setVisibility(8);
                break;
            default:
                int i = ij1Var.o0;
                hl.r(ij1Var.s1);
                if (ij1Var.j1 != ij1Var.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = uc7.s1(i).h1(-ij1Var.p0);
                    tL_channels_restrictSponsoredMessages.restricted = ij1Var.j1;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new ri1(ij1Var, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
