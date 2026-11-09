package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.hx;
import org.telegram.ui.e40;
import org.telegram.ui.nm;
import org.telegram.ui.ra0;
import org.telegram.ui.rn;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ConnectionsManager.getInstance(((hx) ((dx) this.c).c.b).F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((e40) this.c).k1.a).cancelRequest(this.b, true);
                break;
            case 7:
                ((ra0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((z71) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
