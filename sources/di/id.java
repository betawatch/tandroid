package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class id implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ id(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((b7) this.b).run();
                break;
            case 1:
                ((ah.p) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                gi.t0 t0Var = (gi.t0) this.b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.r, true);
                t0Var.q = null;
                t0Var.r = 0;
                break;
            default:
                ((mg.q) this.b).I = false;
                break;
        }
    }
}
