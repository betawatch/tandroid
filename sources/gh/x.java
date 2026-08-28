package gh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.rx;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ho;
import org.telegram.ui.o50;
import org.telegram.ui.pc0;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((c0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.ma) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((cn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ho hoVar = (ho) this.c;
                hoVar.J0 = false;
                hoVar.b = null;
                hoVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).K2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((rx) this.c).c.a.B.Y0).cancelRequest(this.b, true);
                break;
            case 6:
                ((o50) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((pc0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((tc1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
