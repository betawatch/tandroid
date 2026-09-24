package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class j0 extends nf.e {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.o90 o90Var) {
        this.e = i4Var;
        this.f = b3Var;
        this.g = o90Var;
    }

    @Override // nf.e
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

    @Override // nf.e
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.g).a, 9), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) this.g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.k90 k90Var = i4Var.c;
                b3 b3Var = (b3) this.f;
                i4Var.s = b3Var != null ? b3Var.b : null;
                k90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.k90.i(b3Var.d, o90Var.i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.h6.l1(0.8f, w02), org.telegram.ui.ActionBar.h6.l1(1.3f, w02), org.telegram.ui.ActionBar.h6.l1(1.0f, w02), org.telegram.ui.ActionBar.h6.l1(4.0f, w02));
                    i4Var.v.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    k90Var.b(i4Var.v, b3Var);
                }
                View view = i4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                in inVar = (in) this.g;
                inVar.a.vb = ((MessageObject) this.e).getId();
                wn wnVar = inVar.a;
                wnVar.wb = 0;
                wnVar.xb = null;
                ((org.telegram.ui.Cells.u1) this.f).invalidate();
                break;
        }
    }

    public j0(in inVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.g = inVar;
        this.e = messageObject;
        this.f = u1Var;
    }
}
