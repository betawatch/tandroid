package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;

    public /* synthetic */ kd(fe feVar, int i10) {
        this.a = i10;
        this.b = feVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                we.e.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.k51 k51Var = this.b.W0;
                if (k51Var != null) {
                    k51Var.U2.N(true);
                    break;
                }
                break;
            case 2:
                fe feVar = this.b;
                feVar.getClass();
                try {
                    org.telegram.ui.Components.zk0 currentListView = feVar.a1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                fe feVar2 = this.b;
                int i10 = feVar2.u0;
                AndroidUtilities.cancelRunOnUIThread(feVar2.r1);
                if (feVar2.i1 != feVar2.j1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-feVar2.v0);
                    tL_channels_restrictSponsoredMessages.restricted = feVar2.i1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new qd(feVar2, 0));
                    break;
                }
                break;
            case 4:
                fe feVar3 = this.b;
                feVar3.j1 = feVar3.i1;
                break;
            case 5:
                this.b.P0.setLoading(false);
                break;
            case 6:
                this.b.Y0.setVisibility(8);
                break;
            case 7:
                this.b.Y0.setVisibility(8);
                break;
            default:
                we.e.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
