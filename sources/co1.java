// default package

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class co1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout b;

    public /* synthetic */ co1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, byte b) {
        this.a = b;
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        switch (b) {
            case 0:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                break;
            case 1:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                break;
            case 2:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                break;
            default:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                break;
        }
    }
}
