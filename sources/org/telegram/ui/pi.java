package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.sk0 o;
    public final /* synthetic */ yn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(yn ynVar, fb fbVar, org.telegram.ui.Components.sk0 sk0Var) {
        super(fbVar, -2, -2);
        this.p = ynVar;
        this.o = sk0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.sk0 sk0Var = this.o;
        if (sk0Var != null) {
            sk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        yn ynVar = this.p;
        if (ynVar.O8 != this) {
            return;
        }
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
        org.telegram.ui.Components.rc rcVar2 = ynVar.l1;
        if (rcVar == rcVar2 && rcVar2 != null) {
            rcVar2.b();
            ynVar.l1 = null;
        }
        ynVar.O8 = null;
        ynVar.R8 = null;
        ynVar.Q8 = null;
        ynVar.x0.R = true;
        if (ynVar.P8) {
            ynVar.g8(false, true, 0.0f);
        } else {
            ynVar.P8 = true;
        }
        jk jkVar = ynVar.W;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        ynVar.W.getEditField().setAllowDrawCursor(true);
    }
}
