// default package

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h8 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout a;

    public h8(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.invalidate();
    }
}
