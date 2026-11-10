package fi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
