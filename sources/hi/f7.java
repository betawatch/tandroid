package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ f7(l7 l7Var, int i7) {
        this.a = i7;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                l7 l7Var = this.b;
                getwebpagepreview.message = l7Var.U1.d.getText().toString();
                l7Var.e2 = ConnectionsManager.getInstance(l7Var.a).sendRequest(getwebpagepreview, new ai.d1(l7Var, 12));
                break;
            case 1:
                this.b.h1();
                break;
            default:
                l7 l7Var2 = this.b;
                org.telegram.ui.Cells.k3 k3Var = l7Var2.U1;
                if (l7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.J3(k3Var.d);
                    break;
                }
                break;
        }
    }
}
