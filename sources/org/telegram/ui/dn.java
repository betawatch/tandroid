package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class dn extends w7.a6 {
    public MessageObject a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ qn h;

    public dn(qn qnVar) {
        this.h = qnVar;
    }

    @Override // w7.a6
    public final void a() {
        MessageObject messageObject = this.a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.A0.T();
            int indexOf = qnVar.u6.indexOf(this.a) + qnVar.A0.J;
            if (indexOf >= 0) {
                qnVar.z0.i1(indexOf, (int) ((this.e + this.g) - qnVar.s9), this.f);
            }
        } else {
            qnVar.A0.T();
            qnVar.z0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        qnVar.m3 = true;
        qnVar.ad(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override // w7.a6
    public final void c() {
        qn qnVar = this.h;
        qnVar.I9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.I9, qn.Oc);
        ok okVar = qnVar.wa;
        if (okVar.n) {
            okVar.d();
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
