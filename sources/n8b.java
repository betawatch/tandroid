// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r8b b;

    public /* synthetic */ n8b(r8b r8bVar, byte b) {
        this.a = b;
        this.b = r8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r8b r8bVar = this.b;
        switch (b) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = r8bVar.T1.d.getText().toString();
                r8bVar.d2 = ConnectionsManager.getInstance(r8bVar.a).sendRequest(getwebpagepreview, new yp9(r8bVar, (byte) 13));
                break;
            case 1:
                r8bVar.d1();
                break;
            default:
                zt3 zt3Var = r8bVar.T1;
                if (r8bVar.isShowing()) {
                    zt3Var.d.requestFocus();
                    hl.E3(zt3Var.d);
                    break;
                }
                break;
        }
    }
}
