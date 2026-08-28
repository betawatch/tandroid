package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fi extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ org.telegram.ui.Components.uj0 o;
    public final /* synthetic */ qn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(qn qnVar, xa xaVar, org.telegram.ui.Components.uj0 uj0Var) {
        super(xaVar, -2, -2);
        this.p = qnVar;
        this.o = uj0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.uj0 uj0Var = this.o;
        if (uj0Var != null) {
            uj0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        qn qnVar = this.p;
        if (qnVar.M8 != this) {
            return;
        }
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        org.telegram.ui.Components.gc gcVar2 = qnVar.j1;
        if (gcVar == gcVar2 && gcVar2 != null) {
            gcVar2.b();
            qnVar.j1 = null;
        }
        qnVar.M8 = null;
        qnVar.P8 = null;
        qnVar.O8 = null;
        qnVar.v0.R = true;
        if (qnVar.N8) {
            qnVar.g8(false, true, 0.0f);
        } else {
            qnVar.N8 = true;
        }
        ak akVar = qnVar.U;
        if (akVar == null || akVar.getEditField() == null) {
            return;
        }
        qnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
