package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ln extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ yn h;

    public ln(yn ynVar) {
        this.h = ynVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        yn ynVar = this.h;
        if (messageObject != null) {
            ynVar.y0.T();
            int indexOf = ynVar.s6.indexOf(this.a) + ynVar.y0.J;
            if (indexOf >= 0) {
                ynVar.x0.i1(indexOf, (int) ((this.e + this.g) - ynVar.q9), this.f);
            }
        } else {
            ynVar.y0.T();
            ynVar.x0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        ynVar.k3 = true;
        ynVar.Vc(false);
        AndroidUtilities.runOnUIThread(new bj(this, 8));
    }

    @Override // w7.a6
    public final void c() {
        yn ynVar = this.h;
        ynVar.G9 = ynVar.getNotificationCenter().setAnimationInProgress(ynVar.G9, yn.Hc);
        sk skVar = ynVar.ua;
        if (skVar.n) {
            skVar.d();
        }
    }

    @Override // w7.a6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
