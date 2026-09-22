package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ zn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(zn znVar, fj fjVar) {
        super(fjVar, -2, -2);
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
        mk mkVar = znVar.Y;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        znVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
