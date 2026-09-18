package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class on extends w7.y5 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ bo h;

    public on(bo boVar) {
        this.h = boVar;
    }

    @Override // w7.y5
    public final void a() {
        MessageObject messageObject = this.a;
        bo boVar = this.h;
        if (messageObject != null) {
            boVar.A0.T();
            int indexOf = boVar.u6.indexOf(this.a) + boVar.A0.J;
            if (indexOf >= 0) {
                boVar.z0.i1(indexOf, (int) ((this.e + this.g) - boVar.s9), this.f);
            }
        } else {
            boVar.A0.T();
            boVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        boVar.m3 = true;
        boVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ej(this, 8));
    }

    @Override // w7.y5
    public final void c() {
        bo boVar = this.h;
        boVar.I9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.I9, bo.Mc);
        wk wkVar = boVar.wa;
        if (wkVar.n) {
            wkVar.d();
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
