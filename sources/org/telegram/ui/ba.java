package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                ((in) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 2:
                ro roVar = (ro) this.c;
                roVar.N0 = false;
                roVar.b = null;
                roVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.hy) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 5:
                ((d60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 7:
                ((cd0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 8:
                ConnectionsManager.getInstance(((td1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((yh.o) this.c).a).cancelRequest(this.b, true);
                break;
        }
    }
}
