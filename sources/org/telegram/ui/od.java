package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;

    public /* synthetic */ od(ke keVar, int i10) {
        this.a = i10;
        this.b = keVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                of.f.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.d61 d61Var = this.b.a1;
                if (d61Var != null) {
                    d61Var.Y2.N(true);
                    break;
                }
                break;
            case 2:
                ke keVar = this.b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.ll0 currentListView = keVar.e1.getCurrentListView();
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
                int i10 = keVar2.y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.v1);
                if (keVar2.m1 != keVar2.n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    break;
                }
                break;
            case 4:
                ke keVar3 = this.b;
                keVar3.n1 = keVar3.m1;
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
                of.f.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
