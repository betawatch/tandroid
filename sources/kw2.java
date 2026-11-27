// default package

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kw2 extends n8 {
    public final /* synthetic */ nw2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw2(nw2 nw2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = nw2Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rw2 rw2Var = this.o.a;
        rw2Var.k = null;
        rw2Var.K = false;
        if (rw2Var.R) {
            rw2Var.b();
        }
        View view = rw2Var.h;
        if (view != null) {
            if (view instanceof x2b) {
                ((x2b) view).setScaled(false);
            } else if (view instanceof u2b) {
                ((u2b) view).setScaled(false);
            } else if (view instanceof vw2) {
                ((vw2) view).setScaled(false);
            }
            rw2Var.h = null;
        }
    }
}
