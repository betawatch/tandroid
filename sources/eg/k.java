package eg;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.HttpGetFileTask;
import vh.d1;
import yh.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((q) this.b).I = false;
                break;
            case 1:
                ((d1) this.b).run();
                break;
            case 2:
                ((x0) this.b).run();
                break;
            case 3:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            default:
                e0 e0Var = (e0) this.b;
                ConnectionsManager.getInstance(e0Var.d).cancelRequest(e0Var.r, true);
                e0Var.q = null;
                e0Var.r = 0;
                break;
        }
    }
}
