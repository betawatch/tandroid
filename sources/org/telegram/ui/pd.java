package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                org.telegram.ui.Components.r71 r71Var = keVar.X0;
                if (r71Var != null) {
                    boolean z10 = keVar.e0;
                    r71Var.g3.O((keVar.R0 != -1) == keVar.a1.a());
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
