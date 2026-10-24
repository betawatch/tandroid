package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie b;

    public /* synthetic */ od(ie ieVar, int i10) {
        this.a = i10;
        this.b = ieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pf.d.r(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.j71 j71Var = this.b.a1;
                if (j71Var != null) {
                    j71Var.Z2.N(true);
                    break;
                }
                break;
            case 2:
                ie ieVar = this.b;
                ieVar.getClass();
                try {
                    org.telegram.ui.Components.mm0 currentListView = ieVar.e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                ie ieVar2 = this.b;
                int i10 = ieVar2.y0;
                AndroidUtilities.cancelRunOnUIThread(ieVar2.v1);
                if (ieVar2.m1 != ieVar2.n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-ieVar2.z0);
                    tL_channels_restrictSponsoredMessages.restricted = ieVar2.m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(ieVar2, 0));
                    break;
                }
                break;
            case 4:
                ie ieVar3 = this.b;
                ieVar3.n1 = ieVar3.m1;
                break;
            case 5:
                this.b.T0.setLoading(false);
                break;
            case 6:
                this.b.c1.setVisibility(8);
                break;
            case 7:
                this.b.c1.setVisibility(8);
                break;
            default:
                pf.d.r(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
