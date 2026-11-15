package hi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((h4) this.b).run();
                break;
            case 1:
                ((ai.a1) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                li.k0 k0Var = (li.k0) this.b;
                ConnectionsManager.getInstance(k0Var.d).cancelRequest(k0Var.r, true);
                k0Var.q = null;
                k0Var.r = 0;
                break;
            default:
                ((og.o) this.b).J = false;
                break;
        }
    }
}
