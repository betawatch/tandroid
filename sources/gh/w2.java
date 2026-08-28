package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w2(k5 k5Var, String str, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k5.i1(this.b, this.c);
                break;
            case 1:
                ve.e.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 2:
                ve.e.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 3:
                ve.e.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 4:
                ve.e.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 5:
                ve.e.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 6:
                ve.e.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                gc k10 = this.b.getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                k5.n0(this.b, this.c);
                break;
        }
    }
}
