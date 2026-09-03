package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ org.telegram.ui.Components.qk0 o;
    public final /* synthetic */ xn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(xn xnVar, ab abVar, org.telegram.ui.Components.qk0 qk0Var) {
        super(abVar, -2, -2);
        this.p = xnVar;
        this.o = qk0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.qk0 qk0Var = this.o;
        if (qk0Var != null) {
            qk0Var.d();
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
