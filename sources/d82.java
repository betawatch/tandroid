// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
