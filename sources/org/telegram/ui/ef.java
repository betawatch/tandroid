package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;

    public /* synthetic */ ef(zn znVar, int i10, int i11) {
        this.a = i11;
        this.b = znVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.u1 u1Var;
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
                zn znVar = this.b;
                tj tjVar = znVar.x0;
                if (tjVar != null) {
                    int childCount = tjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.equals(znVar.G3)) {
                            u1Var.g4(this.c, true, true);
                        }
                    }
                }
                znVar.G3 = null;
                break;
            case 4:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 5:
                zn.V(this.b, this.c);
                break;
            case 6:
                this.b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.c, new Object[0]));
                break;
            case 7:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 8:
                zn.G0(this.b, this.c);
                break;
            default:
                zn.w1(this.b, this.c);
                break;
        }
    }
}
