package hi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ a8(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                f8 f8Var = this.b;
                getwebpagepreview.message = f8Var.U1.d.getText().toString();
                f8Var.e2 = ConnectionsManager.getInstance(f8Var.a).sendRequest(getwebpagepreview, new ai.b1(f8Var, 12));
                break;
            case 1:
                this.b.i1();
                break;
            default:
                f8 f8Var2 = this.b;
                org.telegram.ui.Cells.l3 l3Var = f8Var2.U1;
                if (f8Var2.isShowing()) {
                    l3Var.d.requestFocus();
                    org.telegram.messenger.g0.I3(l3Var.d);
                    break;
                }
                break;
        }
    }
}
