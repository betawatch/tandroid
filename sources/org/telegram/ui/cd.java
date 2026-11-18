package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;

    public /* synthetic */ cd(xd xdVar, int i7) {
        this.a = i7;
        this.b = xdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object[] objArr = 0;
        xd xdVar = this.b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.gd.M0(2131748212, null));
                break;
            case 1:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.gd.M0(2131748178, null));
                break;
            case 2:
                org.telegram.ui.Components.e51 e51Var = xdVar.Y0;
                if (e51Var != null) {
                    boolean z10 = xdVar.f0;
                    e51Var.g3.O((xdVar.S0 != -1) == xdVar.b1.a());
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
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.mp.u1(i10).j1(-xdVar.q0);
                    tL_channels_restrictSponsoredMessages.restricted = xdVar.k1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new jd(xdVar, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
