package lh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.e60;
import org.telegram.ui.ln;
import org.telegram.ui.od1;
import org.telegram.ui.ro;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ConnectionsManager.getInstance(((org.telegram.ui.ra) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((ln) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ro roVar = (ro) this.c;
                roVar.K0 = false;
                roVar.b = null;
                roVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).L2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((fy) this.c).c.a.C.Z0).cancelRequest(this.b, true);
                break;
            case 6:
                ((e60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((cd0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((od1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
