package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ki extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ org.telegram.ui.Components.cl0 o;
    public final /* synthetic */ sn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(sn snVar, gb gbVar, org.telegram.ui.Components.cl0 cl0Var) {
        super(gbVar, -2, -2);
        this.p = snVar;
        this.o = cl0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.cl0 cl0Var = this.o;
        if (cl0Var != null) {
            cl0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        sn snVar = this.p;
        if (snVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = snVar.n1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            snVar.n1 = null;
        }
        snVar.Q8 = null;
        snVar.T8 = null;
        snVar.S8 = null;
        snVar.z0.R = true;
        if (snVar.R8) {
            snVar.j8(false, true, 0.0f);
        } else {
            snVar.R8 = true;
        }
        hk hkVar = snVar.Y;
        if (hkVar == null || hkVar.getEditField() == null) {
            return;
        }
        snVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
