// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gt0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(((kt0) obj).a).cancelRequest(i, true);
                break;
            case 1:
                ((ve1) obj).g0(i);
                break;
            case 2:
                ((ju1) obj).a.getConnectionsManager().cancelRequest(i, true);
                break;
            case 3:
                int i2 = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj).E3.getConnectionsManager().cancelRequest(i, true);
                break;
            case 4:
                g92 g92Var = (g92) obj;
                g92Var.O0 = false;
                g92Var.b = null;
                g92Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((o14) ((l14) obj).c.b).G.d1).cancelRequest(i, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((j95) obj).n1.a).cancelRequest(i, true);
                break;
            case 7:
                ((uc6) obj).getConnectionsManager().cancelRequest(i, true);
                break;
            case 8:
                ((wx9) obj).getConnectionsManager().cancelRequest(i, true);
                break;
            default:
                ((xqb) obj).c0(i);
                break;
        }
    }
}
