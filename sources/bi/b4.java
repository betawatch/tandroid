package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b4(h7 h7Var, String str, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h7.b0(this.b, this.c);
                break;
            case 1:
                qf.d.t(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 2:
                qf.d.t(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 3:
                qf.d.t(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 4:
                qf.d.t(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 5:
                qf.d.t(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 6:
                qf.d.t(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.ui.Components.qc k10 = this.b.getBulletinFactory().k(false);
                k10.u = true;
                k10.j();
                break;
            default:
                h7.j0(this.b, this.c);
                break;
        }
    }
}
