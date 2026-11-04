package gi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ h7(m7 m7Var, int i3) {
        this.a = i3;
        this.b = m7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                m7 m7Var = this.b;
                getwebpagepreview.message = m7Var.R1.d.getText().toString();
                m7Var.b2 = ConnectionsManager.getInstance(m7Var.a).sendRequest(getwebpagepreview, new ci.d0(m7Var, 11));
                break;
            case 1:
                this.b.h1();
                break;
            default:
                m7 m7Var2 = this.b;
                org.telegram.ui.Cells.k3 k3Var = m7Var2.R1;
                if (m7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.K3(k3Var.d);
                    break;
                }
                break;
        }
    }
}
