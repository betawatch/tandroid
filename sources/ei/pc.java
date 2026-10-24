package ei;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pc implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((p6) this.b).run();
                break;
            case 1:
                ((ah.o) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                hi.s0 s0Var = (hi.s0) this.b;
                ConnectionsManager.getInstance(s0Var.d).cancelRequest(s0Var.r, true);
                s0Var.q = null;
                s0Var.r = 0;
                break;
            default:
                ((mg.p) this.b).I = false;
                break;
        }
    }
}
