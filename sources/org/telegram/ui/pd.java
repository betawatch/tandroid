package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;

    public /* synthetic */ pd(le leVar, int i10) {
        this.a = i10;
        this.b = leVar;
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
                le leVar = this.b;
                leVar.getClass();
                try {
                    org.telegram.ui.Components.vl0 currentListView = leVar.e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                le leVar2 = this.b;
                int i10 = leVar2.y0;
                AndroidUtilities.cancelRunOnUIThread(leVar2.v1);
                if (leVar2.m1 != leVar2.n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-leVar2.z0);
                    tL_channels_restrictSponsoredMessages.restricted = leVar2.m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new vd(leVar2, 0));
                    break;
                }
                break;
            case 4:
                le leVar3 = this.b;
                leVar3.n1 = leVar3.m1;
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
