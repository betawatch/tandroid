package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ int c;

    public /* synthetic */ cf(zn znVar, int i10, int i11) {
        this.a = i11;
        this.b = znVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                this.b.j(this.c, 0, false, 0, true, 0);
                break;
            case 2:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 3:
                zn znVar = this.b;
                sj sjVar = znVar.u0;
                if (sjVar != null) {
                    int childCount = sjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = znVar.u0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(znVar.D3)) {
                            s1Var.g4(this.c, true, true);
                        }
                    }
                }
                znVar.D3 = null;
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
                zn.e0(this.b, this.c);
                break;
            default:
                zn.e1(this.b, this.c);
                break;
        }
    }
}
