package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kn extends k7.d6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ xn h;

    public kn(xn xnVar) {
        this.h = xnVar;
    }

    @Override // k7.d6
    public final void a() {
        MessageObject messageObject = this.a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.x0.T();
            int indexOf = xnVar.r6.indexOf(this.a) + xnVar.x0.G;
            if (indexOf >= 0) {
                xnVar.w0.i1(indexOf, (int) ((this.e + this.g) - xnVar.p9), this.f);
            }
        } else {
            xnVar.x0.T();
            xnVar.w0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        xnVar.j3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new zi(this, 8));
    }

    @Override // k7.d6
    public final void c() {
        xn xnVar = this.h;
        xnVar.F9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.F9, xn.Kc);
        sk skVar = xnVar.ta;
        if (skVar.n) {
            skVar.d();
        }
    }

    @Override // k7.d6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
