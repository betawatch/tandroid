package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(((sa) this.c).currentAccount).cancelRequest(this.b, true);
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
                ((k60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 7:
                ((kd0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 8:
                ConnectionsManager.getInstance(((ce1) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((yh.o) this.c).a).cancelRequest(this.b, true);
                break;
        }
    }
}
