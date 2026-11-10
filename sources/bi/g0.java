package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.gx;
import org.telegram.ui.a81;
import org.telegram.ui.f40;
import org.telegram.ui.nm;
import org.telegram.ui.rn;
import org.telegram.ui.sa0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((n0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((nm) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                rn rnVar = (rn) this.c;
                rnVar.N0 = false;
                rnVar.b = null;
                rnVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((gx) ((cx) this.c).c.b).F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((f40) this.c).n1.a).cancelRequest(this.b, true);
                break;
            case 7:
                ((sa0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((a81) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
