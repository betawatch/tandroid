package lh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.c60;
import org.telegram.ui.hd1;
import org.telegram.ui.jn;
import org.telegram.ui.po;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((b0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.pa) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((jn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                po poVar = (po) this.c;
                poVar.K0 = false;
                poVar.b = null;
                poVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).L2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((fy) this.c).c.a.C.Z0).cancelRequest(this.b, true);
                break;
            case 6:
                ((c60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((ad0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((hd1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
