package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dn extends g7.f6 {
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

    @Override // g7.f6
    public final void a() {
        MessageObject messageObject = this.a;
        qn qnVar = this.h;
        if (messageObject != null) {
            qnVar.w0.T();
            int indexOf = qnVar.q6.indexOf(this.a) + qnVar.w0.F;
            if (indexOf >= 0) {
                qnVar.v0.i1(indexOf, (int) ((this.e + this.g) - qnVar.o9), this.f);
            }
        } else {
            qnVar.w0.T();
            qnVar.v0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        qnVar.i3 = true;
        qnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ri(this, 8));
    }

    @Override // g7.f6
    public final void c() {
        qn qnVar = this.h;
        qnVar.E9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.E9, qn.Jc);
        jk jkVar = qnVar.sa;
        if (jkVar.n) {
            jkVar.d();
        }
    }

    @Override // g7.f6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
