package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mn extends w7.y5 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override // w7.y5
    public final void a() {
        MessageObject messageObject = this.a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.u6.indexOf(this.a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.z0.i1(indexOf, (int) ((this.e + this.g) - znVar.s9), this.f);
            }
        } else {
            znVar.A0.T();
            znVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        znVar.m3 = true;
        znVar.ad(false);
        AndroidUtilities.runOnUIThread(new cj(this, 9));
    }

    @Override // w7.y5
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Nc);
        xk xkVar = znVar.wa;
        if (xkVar.n) {
            xkVar.d();
        }
    }

    @Override // w7.y5
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
