// default package

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i8 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout a;

    public i8(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.invalidate();
    }
}
