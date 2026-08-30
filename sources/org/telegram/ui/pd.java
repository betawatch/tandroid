package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;

    public /* synthetic */ pd(ke keVar, int i10) {
        this.a = i10;
        this.b = keVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af.g.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.g61 g61Var = this.b.X0;
                if (g61Var != null) {
                    g61Var.V2.N(true);
                    break;
                }
                break;
            case 2:
                ke keVar = this.b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.sl0 currentListView = keVar.b1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                ke keVar2 = this.b;
                int i10 = keVar2.v0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.s1);
                if (keVar2.j1 != keVar2.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.w0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new vd(keVar2, 0));
                    break;
                }
                break;
            case 4:
                ke keVar3 = this.b;
                keVar3.k1 = keVar3.j1;
                break;
            case 5:
                this.b.Q0.setLoading(false);
                break;
            case 6:
                this.b.Z0.setVisibility(8);
                break;
            case 7:
                this.b.Z0.setVisibility(8);
                break;
            default:
                af.g.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
