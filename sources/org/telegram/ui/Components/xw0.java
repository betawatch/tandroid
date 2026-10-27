package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class xw0 extends ww0 {
    public Activity l0;
    public final Rect m0;
    public int n0;
    public boolean o0;

    public xw0(Context context, Activity activity) {
        super(context, null);
        this.m0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.ww0
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

    @Override // org.telegram.ui.Components.ww0
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.n0 = Q();
        Point point = AndroidUtilities.displaySize;
        post(new d60(7, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.ww0
    public int getKeyboardHeight() {
        return this.n0;
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
