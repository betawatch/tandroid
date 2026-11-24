// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m72 extends m8 {
    public final /* synthetic */ o72 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m72(o72 o72Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = o72Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        mu1 mu1Var = this.o.H;
        if (mu1Var != null) {
            mu1Var.r6(false, true, 0.0f);
        }
    }
}
