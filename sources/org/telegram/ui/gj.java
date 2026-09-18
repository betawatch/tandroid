package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gj extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ zn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(zn znVar, ej ejVar) {
        super(ejVar, -2, -2);
        this.o = znVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zn znVar = this.o;
        if (znVar.Q8 != this) {
            return;
        }
        znVar.Q8 = null;
        znVar.T8 = null;
        znVar.S8 = null;
        znVar.z0.R = true;
        if (znVar.R8) {
            znVar.g8(false, true, 0.0f);
        } else {
            znVar.R8 = true;
        }
        lk lkVar = znVar.Y;
        if (lkVar == null || lkVar.getEditField() == null) {
            return;
        }
        znVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
