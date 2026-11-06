package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.gx;
import org.telegram.ui.c40;
import org.telegram.ui.lm;
import org.telegram.ui.pa0;
import org.telegram.ui.pn;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                ((lm) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                pn pnVar = (pn) this.c;
                pnVar.N0 = false;
                pnVar.b = null;
                pnVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((gx) ((cx) this.c).c.b).F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((c40) this.c).k1.a).cancelRequest(this.b, true);
                break;
            case 7:
                ((pa0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((x71) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
