package ai;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ny;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.cn;
import org.telegram.ui.io;
import org.telegram.ui.nc0;
import org.telegram.ui.oc1;
import org.telegram.ui.q50;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((k0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.sa) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((cn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                io ioVar = (io) this.c;
                ioVar.N0 = false;
                ioVar.b = null;
                ioVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((ny) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ((q50) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((nc0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((oc1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
