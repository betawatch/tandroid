package lh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ((k7) this.b).run();
                break;
            case 1:
                ((d5.i) this.b).run();
                break;
            case 2:
                ((HttpGetFileTask) this.b).cancel(true);
                break;
            case 3:
                oh.q0 q0Var = (oh.q0) this.b;
                ConnectionsManager.getInstance(q0Var.d).cancelRequest(q0Var.r, true);
                q0Var.q = null;
                q0Var.r = 0;
                break;
            default:
                ((uf.n) this.b).E = false;
                break;
        }
    }
}
