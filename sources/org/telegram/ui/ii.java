package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ org.telegram.ui.Components.cl0 o;
    public final /* synthetic */ qn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(qn qnVar, eb ebVar, org.telegram.ui.Components.cl0 cl0Var) {
        super(ebVar, -2, -2);
        this.p = qnVar;
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
        qn qnVar = this.p;
        if (qnVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = qnVar.n1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            qnVar.n1 = null;
        }
        qnVar.Q8 = null;
        qnVar.T8 = null;
        qnVar.S8 = null;
        qnVar.z0.R = true;
        if (qnVar.R8) {
            qnVar.j8(false, true, 0.0f);
        } else {
            qnVar.R8 = true;
        }
        fk fkVar = qnVar.Y;
        if (fkVar == null || fkVar.getEditField() == null) {
            return;
        }
        qnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
