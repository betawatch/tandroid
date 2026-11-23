package di;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.px;
import org.telegram.ui.e40;
import org.telegram.ui.mm;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;
import org.telegram.ui.y71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ((mm) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                rn rnVar = (rn) this.c;
                rnVar.O0 = false;
                rnVar.b = null;
                rnVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).F3.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((px) ((mx) this.c).c.b).G.d1).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((e40) this.c).o1.a).cancelRequest(this.b, true);
                break;
            case 7:
                ((pa0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((y71) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
