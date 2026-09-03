package mh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hy;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.d60;
import org.telegram.ui.jn;
import org.telegram.ui.od1;
import org.telegram.ui.po;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((a0) this.c).a).cancelRequest(this.b, true);
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
                ConnectionsManager.getInstance(((hy) this.c).c.a.C.Z0).cancelRequest(this.b, true);
                break;
            case 6:
                ((d60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((bd0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((od1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
