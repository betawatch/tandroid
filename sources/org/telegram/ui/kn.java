package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kn extends w7.y5 {
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

    @Override // w7.y5
    public final void a() {
        MessageObject messageObject = this.a;
        xn xnVar = this.h;
        if (messageObject != null) {
            xnVar.A0.T();
            int indexOf = xnVar.u6.indexOf(this.a) + xnVar.A0.J;
            if (indexOf >= 0) {
                xnVar.z0.i1(indexOf, (int) ((this.e + this.g) - xnVar.s9), this.f);
            }
        } else {
            xnVar.A0.T();
            xnVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        xnVar.m3 = true;
        xnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new aj(this, 8));
    }

    @Override // w7.y5
    public final void c() {
        xn xnVar = this.h;
        xnVar.I9 = xnVar.getNotificationCenter().setAnimationInProgress(xnVar.I9, xn.Mc);
        sk skVar = xnVar.wa;
        if (skVar.n) {
            skVar.d();
        }
    }

    @Override // w7.y5
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
