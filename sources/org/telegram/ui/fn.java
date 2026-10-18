package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fn extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ sn h;

    public fn(sn snVar) {
        this.h = snVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.u6.indexOf(this.a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.z0.i1(indexOf, (int) ((this.e + this.g) - snVar.s9), this.f);
            }
        } else {
            snVar.A0.T();
            snVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        snVar.m3 = true;
        snVar.ad(false);
        AndroidUtilities.runOnUIThread(new vi(this, 9));
    }

    @Override // w7.a6
    public final void c() {
        sn snVar = this.h;
        snVar.I9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.I9, sn.Nc);
        qk qkVar = snVar.wa;
        if (qkVar.n) {
            qkVar.d();
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
