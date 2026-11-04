package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;

    public /* synthetic */ cd(xd xdVar, int i3) {
        this.a = i3;
        this.b = xdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Object[] objArr = 0;
        xd xdVar = this.b;
        switch (i3) {
            case 0:
                sf.c.t(xdVar.getContext(), org.telegram.messenger.bd.M0(2131748412, null));
                break;
            case 1:
                sf.c.t(xdVar.getContext(), org.telegram.messenger.bd.M0(2131748378, null));
                break;
            case 2:
                org.telegram.ui.Components.l41 l41Var = xdVar.Y0;
                if (l41Var != null) {
                    boolean z10 = xdVar.f0;
                    l41Var.g3.O((xdVar.S0 != -1) == xdVar.b1.a());
                    if (z10 && xdVar.S0 != -1) {
                        xdVar.a();
                        break;
                    }
                }
                break;
            case 3:
                xdVar.l1 = xdVar.k1;
                break;
            case 4:
                xdVar.K0.setLoading(false);
                break;
            case 5:
                xdVar.Z0.setVisibility(8);
                break;
            case 6:
                xdVar.Z0.setVisibility(8);
                break;
            default:
                int i10 = xdVar.p0;
                org.telegram.messenger.g0.r(xdVar.t1);
                if (xdVar.k1 != xdVar.l1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.hp.s1(i10).h1(-xdVar.q0);
                    tL_channels_restrictSponsoredMessages.restricted = xdVar.k1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new jd(xdVar, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
