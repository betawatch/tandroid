package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((qa) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 1:
                ((nn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 2:
                wo woVar = (wo) this.c;
                woVar.N0 = false;
                woVar.b = null;
                woVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ((ChatActivityEnterView) this.c).O2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.fy) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 5:
                ((i60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 7:
                ((id0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 8:
                ConnectionsManager.getInstance(((be1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((yh.o) this.c).a).cancelRequest(this.b, true);
                break;
        }
    }
}
