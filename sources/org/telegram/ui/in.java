package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class in extends org.telegram.ui.Components.kb1 {
    public MessageObject c;
    public int d = 0;
    public boolean e = true;
    public int f = 0;
    public int g;
    public boolean h;
    public int i;
    public final /* synthetic */ wn j;

    public in(wn wnVar) {
        this.j = wnVar;
    }

    @Override // org.telegram.ui.Components.kb1
    public final void N() {
        MessageObject messageObject = this.c;
        wn wnVar = this.j;
        if (messageObject != null) {
            wnVar.A0.T();
            int indexOf = wnVar.K6.indexOf(this.c) + wnVar.A0.J;
            if (indexOf >= 0) {
                wnVar.z0.i1(indexOf, (int) ((this.g + this.i) - wnVar.I9), this.h);
            }
        } else {
            wnVar.A0.T();
            wnVar.z0.i1(this.d, this.f, this.e);
        }
        this.c = null;
        wnVar.y3 = true;
        wnVar.nd(false);
        AndroidUtilities.runOnUIThread(new xi(this, 9));
    }

    @Override // org.telegram.ui.Components.kb1
    public final void Q() {
        wn wnVar = this.j;
        wnVar.Y9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.Y9, wn.ld);
        sk skVar = wnVar.Ma;
        if (skVar.n) {
            skVar.d();
        }
    }

    @Override // org.telegram.ui.Components.kb1
    public final void S(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
