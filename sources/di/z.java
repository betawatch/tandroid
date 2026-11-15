package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.lx;
import org.telegram.ui.c40;
import org.telegram.ui.lm;
import org.telegram.ui.pa0;
import org.telegram.ui.qn;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((e0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.la) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((lm) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                qn qnVar = (qn) this.c;
                qnVar.O0 = false;
                qnVar.b = null;
                qnVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).x3.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((lx) ((ix) this.c).c.b).G.d1).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((c40) this.c).o1.a).cancelRequest(this.b, true);
                break;
            case 7:
                ((pa0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((w71) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
