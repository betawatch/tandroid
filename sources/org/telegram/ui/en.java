package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class en extends h7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ rn h;

    public en(rn rnVar) {
        this.h = rnVar;
    }

    @Override // h7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        rn rnVar = this.h;
        if (messageObject != null) {
            rnVar.w0.T();
            int indexOf = rnVar.q6.indexOf(this.a) + rnVar.w0.F;
            if (indexOf >= 0) {
                rnVar.v0.i1(indexOf, (int) ((this.e + this.g) - rnVar.o9), this.f);
            }
        } else {
            rnVar.w0.T();
            rnVar.v0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        rnVar.i3 = true;
        rnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ti(this, 8));
    }

    @Override // h7.a6
    public final void c() {
        rn rnVar = this.h;
        rnVar.E9 = rnVar.getNotificationCenter().setAnimationInProgress(rnVar.E9, rn.Jc);
        lk lkVar = rnVar.sa;
        if (lkVar.n) {
            lkVar.d();
        }
    }

    @Override // h7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
