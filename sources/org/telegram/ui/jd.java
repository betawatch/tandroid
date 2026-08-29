package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de b;

    public /* synthetic */ jd(de deVar, int i10) {
        this.a = i10;
        this.b = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ye.d.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.u51 u51Var = this.b.W0;
                if (u51Var != null) {
                    u51Var.U2.N(true);
                    break;
                }
                break;
            case 2:
                de deVar = this.b;
                deVar.getClass();
                try {
                    org.telegram.ui.Components.jl0 currentListView = deVar.a1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                de deVar2 = this.b;
                int i10 = deVar2.u0;
                AndroidUtilities.cancelRunOnUIThread(deVar2.r1);
                if (deVar2.i1 != deVar2.j1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-deVar2.v0);
                    tL_channels_restrictSponsoredMessages.restricted = deVar2.i1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new pd(deVar2, 0));
                    break;
                }
                break;
            case 4:
                de deVar3 = this.b;
                deVar3.j1 = deVar3.i1;
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
                ye.d.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
