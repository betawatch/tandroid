// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ei1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zi1 b;

    public /* synthetic */ ei1(zi1 zi1Var, byte b) {
        this.a = b;
        this.b = zi1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                d01.t(zi1Var.getContext(), k96.M0(2131748212, null));
                break;
            case 1:
                d01.t(zi1Var.getContext(), k96.M0(2131748178, null));
                break;
            case 2:
                q5c q5cVar = zi1Var.X0;
                if (q5cVar != null) {
                    boolean z = zi1Var.f0;
                    q5cVar.g3.O((zi1Var.R0 != -1) == zi1Var.a1.a());
                    if (z && zi1Var.R0 != -1) {
                        zi1Var.a();
                        break;
                    }
                }
                break;
            case 3:
                zi1Var.k1 = zi1Var.j1;
                break;
            case 4:
                zi1Var.J0.setLoading(false);
                break;
            case 5:
                zi1Var.Y0.setVisibility(8);
                break;
            case 6:
                zi1Var.Y0.setVisibility(8);
                break;
            default:
                int i = zi1Var.o0;
                gl.r(zi1Var.s1);
                if (zi1Var.j1 != zi1Var.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = na7.q1(i).f1(-zi1Var.p0);
                    tL_channels_restrictSponsoredMessages.restricted = zi1Var.j1;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new ii1(zi1Var, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
