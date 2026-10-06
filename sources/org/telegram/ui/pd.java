package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;

    public /* synthetic */ pd(me meVar, int i10) {
        this.a = i10;
        this.b = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nf.f.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
            case 1:
                nf.f.s(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 2:
                me meVar = this.b;
                org.telegram.ui.Components.e71 e71Var = meVar.X0;
                if (e71Var != null) {
                    boolean z10 = meVar.e0;
                    e71Var.f3.N((meVar.R0 != -1) == meVar.a1.a());
                    if (z10 && meVar.R0 != -1) {
                        meVar.a();
                        break;
                    }
                }
                break;
            case 3:
                me meVar2 = this.b;
                meVar2.k1 = meVar2.j1;
                break;
            case 4:
                this.b.J0.setLoading(false);
                break;
            case 5:
                this.b.Y0.setVisibility(8);
                break;
            case 6:
                this.b.Y0.setVisibility(8);
                break;
            default:
                me meVar3 = this.b;
                int i10 = meVar3.o0;
                AndroidUtilities.cancelRunOnUIThread(meVar3.s1);
                if (meVar3.j1 != meVar3.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar3.p0);
                    tL_channels_restrictSponsoredMessages.restricted = meVar3.j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(meVar3, 0));
                    break;
                }
                break;
        }
    }
}
