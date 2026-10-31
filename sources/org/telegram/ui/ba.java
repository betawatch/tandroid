package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ConnectionsManager.getInstance(((oa) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 1:
                ((fn) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 2:
                oo ooVar = (oo) this.c;
                ooVar.N0 = false;
                ooVar.b = null;
                ooVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ((ChatActivityEnterView) this.c).P2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.ux) ((org.telegram.ui.Components.rx) this.c).c.b).F.c1).cancelRequest(this.b, true);
                break;
            case 5:
                ConnectionsManager.getInstance(((b50) this.c).k1.a).cancelRequest(this.b, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((LanguageSelectActivity) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            case 7:
                ((yb0) this.c).getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 8:
                ConnectionsManager.getInstance(((p91) this.c).currentAccount).cancelRequest(this.b, true);
                break;
            default:
                ConnectionsManager.getInstance(((rh.r) this.c).a).cancelRequest(this.b, true);
                break;
        }
    }
}
