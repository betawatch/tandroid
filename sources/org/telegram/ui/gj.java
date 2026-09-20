package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
