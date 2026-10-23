package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class pw0 extends ow0 {
    public Activity w0;
    public final Rect x0;
    public int y0;
    public boolean z0;

    public pw0(Context context, Activity activity) {
        super(context, null);
        this.x0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.ow0
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.x0;
        getWindowVisibleDisplayFrame(rect);
        if (this.z0) {
            return ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.w0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.ow0
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.y0 = Q();
        Point point = AndroidUtilities.displaySize;
        post(new b60(7, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.ow0
    public int getKeyboardHeight() {
        return this.y0;
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.w0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.z0 = z10;
    }
}
