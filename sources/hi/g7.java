package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ g7(l7 l7Var, int i7) {
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
                l7Var.e2 = ConnectionsManager.getInstance(l7Var.a).sendRequest(getwebpagepreview, new ai.e1(l7Var, 12));
                break;
            case 1:
                this.b.i1();
                break;
            default:
                l7 l7Var2 = this.b;
                org.telegram.ui.Cells.l3 l3Var = l7Var2.U1;
                if (l7Var2.isShowing()) {
                    l3Var.d.requestFocus();
                    org.telegram.messenger.g0.I3(l3Var.d);
                    break;
                }
                break;
        }
    }
}
