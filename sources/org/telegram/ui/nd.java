package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je b;

    public /* synthetic */ nd(je jeVar, int i10) {
        this.a = i10;
        this.b = jeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nf.f.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.r61 r61Var = this.b.a1;
                if (r61Var != null) {
                    r61Var.Y2.N(true);
                    break;
                }
                break;
            case 2:
                je jeVar = this.b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.wl0 currentListView = jeVar.e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                je jeVar2 = this.b;
                int i10 = jeVar2.y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.v1);
                if (jeVar2.m1 != jeVar2.n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    break;
                }
                break;
            case 4:
                je jeVar3 = this.b;
                jeVar3.n1 = jeVar3.m1;
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
                nf.f.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
