package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                qf.d.r(this.b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
            case 1:
                qf.d.r(this.b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 2:
                ke keVar = this.b;
                org.telegram.ui.Components.s71 s71Var = keVar.X0;
                if (s71Var != null) {
                    boolean z10 = keVar.e0;
                    s71Var.g3.O((keVar.R0 != -1) == keVar.a1.a());
                    if (z10 && keVar.R0 != -1) {
                        keVar.a();
                        break;
                    }
                }
                break;
            case 3:
                ke keVar2 = this.b;
                keVar2.k1 = keVar2.j1;
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
                ke keVar3 = this.b;
                int i10 = keVar3.o0;
                AndroidUtilities.cancelRunOnUIThread(keVar3.s1);
                if (keVar3.j1 != keVar3.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar3.p0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar3.j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(keVar3, 0));
                    break;
                }
                break;
        }
    }
}
