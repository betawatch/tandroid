package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class av0 extends zu0 {
    public Activity s0;
    public final Rect t0;
    public int u0;
    public boolean v0;

    public av0(Context context, Activity activity) {
        super(context, null);
        this.t0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
    public void S() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.u0 = R();
        Point point = AndroidUtilities.displaySize;
        post(new f50(7, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.zu0
    public int getKeyboardHeight() {
        return this.u0;
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setActivity(Activity activity) {
        this.s0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.v0 = z10;
    }
}
