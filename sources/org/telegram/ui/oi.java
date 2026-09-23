package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oi extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.gk0 o;
    public final /* synthetic */ xn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(xn xnVar, db dbVar, org.telegram.ui.Components.gk0 gk0Var) {
        super(dbVar, -2, -2);
        this.p = xnVar;
        this.o = gk0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gk0 gk0Var = this.o;
        if (gk0Var != null) {
            gk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xn xnVar = this.p;
        if (xnVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = xnVar.n1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            xnVar.n1 = null;
        }
        xnVar.Q8 = null;
        xnVar.T8 = null;
        xnVar.S8 = null;
        xnVar.z0.R = true;
        if (xnVar.R8) {
            xnVar.g8(false, true, 0.0f);
        } else {
            xnVar.R8 = true;
        }
        jk jkVar = xnVar.Y;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        xnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
