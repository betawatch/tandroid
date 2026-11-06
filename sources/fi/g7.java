package fi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ g7(m7 m7Var, int i7) {
        this.a = i7;
        this.b = m7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                m7 m7Var = this.b;
                getwebpagepreview.message = m7Var.Q1.d.getText().toString();
                m7Var.a2 = ConnectionsManager.getInstance(m7Var.a).sendRequest(getwebpagepreview, new bi.j0(m7Var, 11));
                break;
            case 1:
                this.b.h1();
                break;
            default:
                m7 m7Var2 = this.b;
                org.telegram.ui.Cells.k3 k3Var = m7Var2.Q1;
                if (m7Var2.isShowing()) {
                    k3Var.d.requestFocus();
                    org.telegram.messenger.g0.K3(k3Var.d);
                    break;
                }
                break;
        }
    }
}
