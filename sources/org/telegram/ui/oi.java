package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class oi extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ org.telegram.ui.Components.qk0 o;
    public final /* synthetic */ wn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(wn wnVar, db dbVar, org.telegram.ui.Components.qk0 qk0Var) {
        super(dbVar, -2, -2);
        this.p = wnVar;
        this.o = qk0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.qk0 qk0Var = this.o;
        if (qk0Var != null) {
            qk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wn wnVar = this.p;
        if (wnVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = wnVar.n1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            wnVar.n1 = null;
        }
        wnVar.Q8 = null;
        wnVar.T8 = null;
        wnVar.S8 = null;
        wnVar.z0.R = true;
        if (wnVar.R8) {
            wnVar.g8(false, true, 0.0f);
        } else {
            wnVar.R8 = true;
        }
        jk jkVar = wnVar.Y;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        wnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
