package eg;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.HttpGetFileTask;
import vh.r0;
import yh.d0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                ((r0) this.b).run();
                break;
            case 2:
                ((x0) this.b).run();
                break;
            case 3:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            default:
                d0 d0Var = (d0) this.b;
                ConnectionsManager.getInstance(d0Var.d).cancelRequest(d0Var.r, true);
                d0Var.q = null;
                d0Var.r = 0;
                break;
        }
    }
}
