// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mj1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ik1 b;

    public /* synthetic */ mj1(ik1 ik1Var, byte b) {
        this.a = b;
        this.b = ik1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                l11.u(ik1Var.getContext(), jb6.M0(2131748161, null));
                break;
            case 1:
                l11.u(ik1Var.getContext(), jb6.M0(2131748127, null));
                break;
            case 2:
                q7c q7cVar = ik1Var.X0;
                if (q7cVar != null) {
                    boolean z = ik1Var.f0;
                    q7cVar.g3.O((ik1Var.R0 != -1) == ik1Var.a1.a());
                    if (z && ik1Var.R0 != -1) {
                        ik1Var.a();
                        break;
                    }
                }
                break;
            case 3:
                ik1Var.k1 = ik1Var.j1;
                break;
            case 4:
                ik1Var.J0.setLoading(false);
                break;
            case 5:
                ik1Var.Y0.setVisibility(8);
                break;
            case 6:
                ik1Var.Y0.setVisibility(8);
                break;
            default:
                int i = ik1Var.o0;
                gm.r(ik1Var.s1);
                if (ik1Var.j1 != ik1Var.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = oc7.r1(i).g1(-ik1Var.p0);
                    tL_channels_restrictSponsoredMessages.restricted = ik1Var.j1;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new qj1(ik1Var, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
