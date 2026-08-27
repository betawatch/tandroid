package hh;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.sx;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.dn;
import org.telegram.ui.jo;
import org.telegram.ui.s50;
import org.telegram.ui.tc0;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((c0) this.c).a).cancelRequest(this.b, true);
                break;
            case 1:
                ConnectionsManager.getInstance(((org.telegram.ui.na) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((dn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                jo joVar = (jo) this.c;
                joVar.J0 = false;
                joVar.b = null;
                joVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).K2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((sx) this.c).c.a.B.Y0).cancelRequest(this.b, true);
                break;
            case 6:
                ((s50) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((tc0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((tc1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
