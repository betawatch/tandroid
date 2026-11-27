// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oc6 extends n8 {
    public final /* synthetic */ uc6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc6(uc6 uc6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = uc6Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.P0 = null;
    }
}
