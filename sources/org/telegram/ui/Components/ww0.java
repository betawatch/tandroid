package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class ww0 extends vw0 {
    public Activity l0;
    public final Rect m0;
    public int n0;
    public boolean o0;

    public ww0(Context context, Activity activity) {
        super(context, null);
        this.m0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.vw0
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.m0;
        getWindowVisibleDisplayFrame(rect);
        if (this.o0) {
            return ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.l0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.vw0
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.n0 = Q();
        Point point = AndroidUtilities.displaySize;
        post(new d60(7, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.vw0
    public int getKeyboardHeight() {
        return this.n0;
    }

    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.l0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.o0 = z10;
    }
}
