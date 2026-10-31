package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;

    public /* synthetic */ md(le leVar, int i10) {
        this.a = i10;
        this.b = leVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object[] objArr = 0;
        le leVar = this.b;
        switch (i10) {
            case 0:
                gf.f.r(leVar.getContext(), org.telegram.messenger.cd.L0(2131748419, null));
                break;
            case 1:
                gf.f.r(leVar.getContext(), org.telegram.messenger.cd.L0(2131748385, null));
                break;
            case 2:
                org.telegram.ui.Components.u51 u51Var = leVar.X0;
                if (u51Var != null) {
                    boolean z10 = leVar.e0;
                    u51Var.f3.O((leVar.R0 != -1) == leVar.a1.a());
                    if (z10 && leVar.R0 != -1) {
                        leVar.a();
                        break;
                    }
                }
                break;
            case 3:
                leVar.k1 = leVar.j1;
                break;
            case 4:
                leVar.J0.setLoading(false);
                break;
            case 5:
                leVar.Y0.setVisibility(8);
                break;
            case 6:
                leVar.Y0.setVisibility(8);
                break;
            default:
                int i11 = leVar.o0;
                org.telegram.messenger.i0.r(leVar.s1);
                if (leVar.j1 != leVar.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.vp.r1(i11).g1(-leVar.p0);
                    tL_channels_restrictSponsoredMessages.restricted = leVar.j1;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_channels_restrictSponsoredMessages, new td(leVar, objArr == true ? 1 : 0));
                    break;
                }
                break;
        }
    }
}
