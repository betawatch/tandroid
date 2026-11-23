package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ f7(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                k7 k7Var = this.b;
                getwebpagepreview.message = k7Var.U1.d.getText().toString();
                k7Var.e2 = ConnectionsManager.getInstance(k7Var.a).sendRequest(getwebpagepreview, new ai.g1(k7Var, 12));
                break;
            case 1:
                this.b.i1();
                break;
            default:
                k7 k7Var2 = this.b;
                org.telegram.ui.Cells.l3 l3Var = k7Var2.U1;
                if (k7Var2.isShowing()) {
                    l3Var.d.requestFocus();
                    org.telegram.messenger.g0.I3(l3Var.d);
                    break;
                }
                break;
        }
    }
}
