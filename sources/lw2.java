// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lw2 extends n8 {
    public final /* synthetic */ nw2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw2(nw2 nw2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
    }
}
