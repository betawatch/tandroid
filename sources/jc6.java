// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jc6 extends m8 {
    public final /* synthetic */ pc6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc6(pc6 pc6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = pc6Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.P0 = null;
    }
}
