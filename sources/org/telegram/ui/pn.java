package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pn extends w7.y5 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ co h;

    public pn(co coVar) {
        this.h = coVar;
    }

    @Override // w7.y5
    public final void a() {
        MessageObject messageObject = this.a;
        co coVar = this.h;
        if (messageObject != null) {
            coVar.A0.T();
            int indexOf = coVar.u6.indexOf(this.a) + coVar.A0.J;
            if (indexOf >= 0) {
                coVar.z0.i1(indexOf, (int) ((this.e + this.g) - coVar.s9), this.f);
            }
        } else {
            coVar.A0.T();
            coVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        coVar.m3 = true;
        coVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override // w7.y5
    public final void c() {
        co coVar = this.h;
        coVar.I9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.I9, co.Nc);
        vk vkVar = coVar.wa;
        if (vkVar.n) {
            vkVar.d();
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
