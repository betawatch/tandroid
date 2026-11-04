package ci;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.ex;
import org.telegram.ui.hm;
import org.telegram.ui.la0;
import org.telegram.ui.ln;
import org.telegram.ui.o71;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((i0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.ka) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((hm) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ln lnVar = (ln) this.c;
                lnVar.O0 = false;
                lnVar.b = null;
                lnVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).Q2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((ex) ((bx) this.c).c.b).G.d1).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((x30) this.c).l1.a).cancelRequest(this.b, true);
                break;
            case 7:
                ((la0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((o71) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
