package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((b9) this.b).run();
                break;
            case 1:
                ((ai.s1) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                fi.t0 t0Var = (fi.t0) this.b;
                ConnectionsManager.getInstance(t0Var.d).cancelRequest(t0Var.r, true);
                t0Var.q = null;
                t0Var.r = 0;
                break;
            default:
                ((lg.p) this.b).I = false;
                break;
        }
    }
}
