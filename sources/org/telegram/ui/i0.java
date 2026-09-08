package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i0 extends of.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public i0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.e90 e90Var) {
        this.e = i4Var;
        this.f = b3Var;
        this.g = e90Var;
    }

    @Override // of.e
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.c.l(i4Var.v, true);
                View view = i4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                break;
            default:
                super.b();
                break;
        }
    }

    @Override // of.e
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ak(((on) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // of.e
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) this.g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.a90 a90Var = i4Var.c;
                b3 b3Var = (b3) this.f;
                i4Var.s = b3Var != null ? b3Var.b : null;
                a90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.a90.i(b3Var.d, e90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    i4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    a90Var.b(i4Var.v, b3Var);
                }
                View view = i4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                on onVar = (on) this.g;
                onVar.a.wb = ((MessageObject) this.e).getId();
                co coVar = onVar.a;
                coVar.xb = 0;
                coVar.yb = null;
                ((org.telegram.ui.Cells.t1) this.f).invalidate();
                break;
        }
    }

    public i0(on onVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.g = onVar;
        this.e = messageObject;
        this.f = t1Var;
    }
}
