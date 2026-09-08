package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                ((on) this.c).a.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 2:
                xo xoVar = (xo) this.c;
                xoVar.N0 = false;
                xoVar.b = null;
                xoVar.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 3:
                ((ChatActivityEnterView) this.c).O2.getConnectionsManager().cancelRequest(this.b, true);
                break;
            case 4:
                ConnectionsManager.getInstance(((org.telegram.ui.Components.gy) this.c).c.a.F.c1).cancelRequest(this.b, true);
                break;
            case 5:
                ((j60) this.c).d.getConnectionsManager().cancelRequest(this.b, true);
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
                ConnectionsManager.getInstance(((zh.o) this.c).a).cancelRequest(this.b, true);
                break;
        }
    }
}
