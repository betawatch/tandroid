package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class yu0 extends xu0 {
    public Activity s0;
    public final Rect t0;
    public int u0;
    public boolean v0;

    public yu0(Context context, Activity activity) {
        super(context, null);
        this.t0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.xu0
    public int R() {
        View rootView = getRootView();
        Rect rect = this.t0;
        getWindowVisibleDisplayFrame(rect);
        if (this.v0) {
            return ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.s0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.xu0
    public void S() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.u0 = R();
        Point point = AndroidUtilities.displaySize;
        post(new a50(7, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.xu0
    public int getKeyboardHeight() {
        return this.u0;
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        S();
    }

    public void setActivity(Activity activity) {
        this.s0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.v0 = z10;
    }
}
