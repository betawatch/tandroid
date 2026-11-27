// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d82 extends n8 {
    public final /* synthetic */ f82 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d82(f82 f82Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = f82Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zu1 zu1Var = this.o.H;
        if (zu1Var != null) {
            zu1Var.y6(false, true, 0.0f);
        }
    }
}
