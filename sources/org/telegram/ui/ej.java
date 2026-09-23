package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ej extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ xn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(xn xnVar, cj cjVar) {
        super(cjVar, -2, -2);
        this.o = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xn xnVar = this.o;
        if (xnVar.Q8 != this) {
            return;
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
