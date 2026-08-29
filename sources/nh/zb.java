package nh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ll0;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((b6) this.b).run();
                break;
            case 1:
                ((ll0) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                qh.o0 o0Var = (qh.o0) this.b;
                ConnectionsManager.getInstance(o0Var.d).cancelRequest(o0Var.r, true);
                o0Var.q = null;
                o0Var.r = 0;
                break;
            default:
                ((wf.n) this.b).E = false;
                break;
        }
    }
}
