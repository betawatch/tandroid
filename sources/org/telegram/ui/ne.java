package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ int c;

    public /* synthetic */ ne(wm wmVar, int i3, int i10) {
        this.a = i10;
        this.b = wmVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                this.b.l(this.c, 0, false, 0, true, 0);
                break;
            case 2:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 3:
                wm wmVar = this.b;
                wi wiVar = wmVar.A0;
                if (wiVar != null) {
                    int childCount = wiVar.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = wmVar.A0.getChildAt(i3);
                        if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.T(wmVar.V3)) {
                            q1Var.E3(this.c, true, true);
                        }
                    }
                }
                wmVar.V3 = null;
                break;
            case 4:
                this.b.actionBar.getActionBarMenuOnItemClick().b(this.c);
                break;
            case 5:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 6:
                wm.b0(this.b, this.c);
                break;
            case 7:
                this.b.actionBar.setSubtitle(org.telegram.messenger.bd.G(this.c, "messages", new Object[0]));
                break;
            case 8:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 9:
                wm.L0(this.b, this.c);
                break;
            default:
                wm.Y0(this.b, this.c);
                break;
        }
    }
}
