package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;

    public /* synthetic */ kd(fe feVar, int i9) {
        this.a = i9;
        this.b = feVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ve.e.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.i51 i51Var = this.b.W0;
                if (i51Var != null) {
                    i51Var.U2.N(true);
                    break;
                }
                break;
            case 2:
                fe feVar = this.b;
                feVar.getClass();
                try {
                    org.telegram.ui.Components.wk0 currentListView = feVar.a1.getCurrentListView();
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
                int i9 = feVar2.u0;
                AndroidUtilities.cancelRunOnUIThread(feVar2.r1);
                if (feVar2.i1 != feVar2.j1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i9).getInputChannel(-feVar2.v0);
                    tL_channels_restrictSponsoredMessages.restricted = feVar2.i1;
                    ConnectionsManager.getInstance(i9).sendRequest(tL_channels_restrictSponsoredMessages, new qd(feVar2, 0));
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
                ve.e.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
