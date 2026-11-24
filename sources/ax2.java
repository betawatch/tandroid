// default package

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ax2 extends m8 {
    public final /* synthetic */ dx2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax2(dx2 dx2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = dx2Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        hx2 hx2Var = this.o.a;
        hx2Var.k = null;
        hx2Var.K = false;
        if (hx2Var.R) {
            hx2Var.b();
        }
        View view = hx2Var.h;
        if (view != null) {
            if (view instanceof y0b) {
                ((y0b) view).setScaled(false);
            } else if (view instanceof v0b) {
                ((v0b) view).setScaled(false);
            } else if (view instanceof lx2) {
                ((lx2) view).setScaled(false);
            }
            hx2Var.h = null;
        }
    }
}
