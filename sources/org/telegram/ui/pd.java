package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                org.telegram.ui.Components.c71 c71Var = meVar.a2;
                if (c71Var != null) {
                    boolean z10 = meVar.h1;
                    c71Var.f3.N((meVar.U1 != -1) == meVar.d2.a());
                    if (z10 && meVar.U1 != -1) {
                        meVar.Z();
                        break;
                    }
                }
                break;
            case 3:
                me meVar2 = this.b;
                meVar2.n2 = meVar2.m2;
                break;
            case 4:
                this.b.M1.setLoading(false);
                break;
            case 5:
                this.b.b2.setVisibility(8);
                break;
            case 6:
                this.b.b2.setVisibility(8);
                break;
            default:
                me meVar3 = this.b;
                int i10 = meVar3.r1;
                AndroidUtilities.cancelRunOnUIThread(meVar3.v2);
                if (meVar3.m2 != meVar3.n2) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar3.s1);
                    tL_channels_restrictSponsoredMessages.restricted = meVar3.m2;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(meVar3, 0));
                    break;
                }
                break;
        }
    }
}
