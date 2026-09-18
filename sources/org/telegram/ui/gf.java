package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ int c;

    public /* synthetic */ gf(bo boVar, int i10, int i11) {
        this.a = i11;
        this.b = boVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                this.b.F(this.c, 0, 0, 0, false, true);
                break;
            case 2:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 3:
                bo boVar = this.b;
                vj vjVar = boVar.x0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = boVar.x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(boVar.G3)) {
                            t1Var.g4(this.c, true, true);
                        }
                    }
                }
                boVar.G3 = null;
                break;
            case 4:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 5:
                bo.V(this.b, this.c);
                break;
            case 6:
                this.b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.c, new Object[0]));
                break;
            case 7:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 8:
                bo.e0(this.b, this.c);
                break;
            default:
                bo.e1(this.b, this.c);
                break;
        }
    }
}
