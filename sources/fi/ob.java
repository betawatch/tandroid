package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((f2.h) this.b).run();
                break;
            case 1:
                ((ai.e0) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                ii.l0 l0Var = (ii.l0) this.b;
                ConnectionsManager.getInstance(l0Var.d).cancelRequest(l0Var.r, true);
                l0Var.q = null;
                l0Var.r = 0;
                break;
            default:
                ((og.o) this.b).I = false;
                break;
        }
    }
}
