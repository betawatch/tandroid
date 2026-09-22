package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ bo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(bo boVar, fj fjVar) {
        super(fjVar, -2, -2);
        this.o = boVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        bo boVar = this.o;
        if (boVar.Q8 != this) {
            return;
        }
        boVar.Q8 = null;
        boVar.T8 = null;
        boVar.S8 = null;
        boVar.z0.R = true;
        if (boVar.R8) {
            boVar.g8(false, true, 0.0f);
        } else {
            boVar.R8 = true;
        }
        mk mkVar = boVar.Y;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        boVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
