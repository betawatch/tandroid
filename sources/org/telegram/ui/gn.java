package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gn extends org.telegram.ui.Components.gb1 {
    public MessageObject c;
    public int d = 0;
    public boolean e = true;
    public int f = 0;
    public int g;
    public boolean h;
    public int i;
    public final /* synthetic */ un j;

    public gn(un unVar) {
        this.j = unVar;
    }

    @Override // org.telegram.ui.Components.gb1
    public final void N() {
        MessageObject messageObject = this.c;
        un unVar = this.j;
        if (messageObject != null) {
            unVar.A0.T();
            int indexOf = unVar.G6.indexOf(this.c) + unVar.A0.J;
            if (indexOf >= 0) {
                unVar.z0.i1(indexOf, (int) ((this.g + this.i) - unVar.E9), this.h);
            }
        } else {
            unVar.A0.T();
            unVar.z0.i1(this.d, this.f, this.e);
        }
        this.c = null;
        unVar.y3 = true;
        unVar.jd(false);
        AndroidUtilities.runOnUIThread(new ui(this, 9));
    }

    @Override // org.telegram.ui.Components.gb1
    public final void Q() {
        un unVar = this.j;
        unVar.U9 = unVar.getNotificationCenter().setAnimationInProgress(unVar.U9, un.hd);
        qk qkVar = unVar.Ia;
        if (qkVar.n) {
            qkVar.d();
        }
    }

    @Override // org.telegram.ui.Components.gb1
    public final void S(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
