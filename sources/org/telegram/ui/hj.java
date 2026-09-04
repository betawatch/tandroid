package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ co o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(co coVar, fj fjVar) {
        super(fjVar, -2, -2);
        this.o = coVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        co coVar = this.o;
        if (coVar.Q8 != this) {
            return;
        }
        coVar.Q8 = null;
        coVar.T8 = null;
        coVar.S8 = null;
        coVar.z0.R = true;
        if (coVar.R8) {
            coVar.g8(false, true, 0.0f);
        } else {
            coVar.R8 = true;
        }
        mk mkVar = coVar.Y;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        coVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
