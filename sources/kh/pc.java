package kh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pc implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((o8) this.b).run();
                break;
            case 1:
                ((d5.i) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                nh.q0 q0Var = (nh.q0) this.b;
                ConnectionsManager.getInstance(q0Var.d).cancelRequest(q0Var.r, true);
                q0Var.q = null;
                q0Var.r = 0;
                break;
            default:
                ((tf.n) this.b).E = false;
                break;
        }
    }
}
