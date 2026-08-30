package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ org.telegram.ui.Components.pk0 o;
    public final /* synthetic */ xn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(xn xnVar, ab abVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(abVar, -2, -2);
        this.p = xnVar;
        this.o = pk0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xn xnVar = this.p;
        if (xnVar.N8 != this) {
            return;
        }
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        org.telegram.ui.Components.ic icVar2 = xnVar.k1;
        if (icVar == icVar2 && icVar2 != null) {
            icVar2.b();
            xnVar.k1 = null;
        }
        xnVar.N8 = null;
        xnVar.Q8 = null;
        xnVar.P8 = null;
        xnVar.w0.R = true;
        if (xnVar.O8) {
            xnVar.g8(false, true, 0.0f);
        } else {
            xnVar.O8 = true;
        }
        jk jkVar = xnVar.V;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        xnVar.V.getEditField().setAllowDrawCursor(true);
    }
}
