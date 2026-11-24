// default package

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout b;

    public /* synthetic */ hn1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, byte b) {
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
