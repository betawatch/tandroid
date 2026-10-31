package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class vu0 extends uu0 {
    public Activity f0;
    public final Rect g0;
    public int h0;
    public boolean i0;

    public vu0(Context context, Activity activity) {
        super(context, null);
        this.g0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.uu0
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.g0;
        getWindowVisibleDisplayFrame(rect);
        if (this.i0) {
            return ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.i0.q1(rootView)) - rootView.getBottom();
        if (height <= Math.max(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.m)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.uu0
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.h0 = Q();
        Point point = org.telegram.messenger.i0.q;
        post(new k2.v(23, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.uu0
    public int getKeyboardHeight() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.f0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.i0 = z10;
    }
}
