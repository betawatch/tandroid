package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ bo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(bo boVar, gj gjVar) {
        super(gjVar, -2, -2);
        this.o = boVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
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
        nk nkVar = boVar.Y;
        if (nkVar == null || nkVar.getEditField() == null) {
            return;
        }
        boVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
