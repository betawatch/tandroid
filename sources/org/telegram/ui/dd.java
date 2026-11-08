package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd b;

    public /* synthetic */ dd(zd zdVar, int i7) {
        this.a = i7;
        this.b = zdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object[] objArr = 0;
        zd zdVar = this.b;
        switch (i7) {
            case 0:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.id.M0(2131748405, null));
                break;
            case 1:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.id.M0(2131748371, null));
                break;
            case 2:
                org.telegram.ui.Components.q41 q41Var = zdVar.X0;
                if (q41Var != null) {
                    boolean z9 = zdVar.e0;
                    q41Var.f3.O((zdVar.R0 != -1) == zdVar.a1.a());
                    if (z9 && zdVar.R0 != -1) {
                        zdVar.a();
                        break;
                    }
                }
                break;
            case 3:
                zdVar.k1 = zdVar.j1;
                break;
            case 4:
                zdVar.J0.setLoading(false);
                break;
            case 5:
                zdVar.Y0.setVisibility(8);
                break;
            case 6:
                zdVar.Y0.setVisibility(8);
                break;
            default:
                int i10 = zdVar.o0;
                org.telegram.messenger.g0.r(zdVar.s1);
                if (zdVar.j1 != zdVar.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.qp.s1(i10).h1(-zdVar.p0);
                    tL_channels_restrictSponsoredMessages.restricted = zdVar.j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new kd(zdVar, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
