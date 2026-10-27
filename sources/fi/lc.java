package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lc implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lc(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((e2.q0) this.b).run();
                break;
            case 1:
                ((ai.h0) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                ii.r0 r0Var = (ii.r0) this.b;
                ConnectionsManager.getInstance(r0Var.d).cancelRequest(r0Var.r, true);
                r0Var.q = null;
                r0Var.r = 0;
                break;
            default:
                ((ng.p) this.b).I = false;
                break;
        }
    }
}
