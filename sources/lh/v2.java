package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v2(g5 g5Var, String str, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g5.i1(this.b, this.c);
                break;
            case 1:
                ze.d.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 2:
                ze.d.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 3:
                ze.d.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 4:
                ze.d.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 5:
                ze.d.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 6:
                ze.d.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                ic k10 = this.b.getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                g5.o0(this.b, this.c);
                break;
        }
    }
}
