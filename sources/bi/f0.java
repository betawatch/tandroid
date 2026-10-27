package bi;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.my;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ad1;
import org.telegram.ui.hn;
import org.telegram.ui.oo;
import org.telegram.ui.rc0;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ((hn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                oo ooVar = (oo) this.c;
                ooVar.M0 = false;
                ooVar.b = null;
                ooVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((my) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ((x50) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((rc0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((ad1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
