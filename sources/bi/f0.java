package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.my;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.fn;
import org.telegram.ui.mo;
import org.telegram.ui.pc0;
import org.telegram.ui.v50;
import org.telegram.ui.xc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((m0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.ta) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((fn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                mo moVar = (mo) this.c;
                moVar.M0 = false;
                moVar.b = null;
                moVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((my) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ((v50) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((pc0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((xc1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
