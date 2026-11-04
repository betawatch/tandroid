package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class rt0 extends qt0 {
    public Activity g0;
    public final Rect h0;
    public int i0;
    public boolean j0;

    public rt0(Context context, Activity activity) {
        super(context, null);
        this.h0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.qt0
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.h0;
        getWindowVisibleDisplayFrame(rect);
        if (this.j0) {
            return ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.g0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.m)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.qt0
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.i0 = Q();
        Point point = org.telegram.messenger.g0.q;
        post(new up0(3, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.qt0
    public int getKeyboardHeight() {
        return this.i0;
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.g0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.j0 = z10;
    }
}
