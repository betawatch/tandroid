package ai;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ny;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.en;
import org.telegram.ui.ko;
import org.telegram.ui.pc0;
import org.telegram.ui.qc1;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                ConnectionsManager.getInstance(((org.telegram.ui.ua) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 2:
                ((en) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ko koVar = (ko) this.c;
                koVar.N0 = false;
                koVar.b = null;
                koVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((ny) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 6:
                ((s50) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 8:
                ((pc0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((qc1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
        }
    }
}
