package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class tt0 extends st0 {
    public Activity f0;
    public final Rect g0;
    public int h0;
    public boolean i0;

    public tt0(Context context, Activity activity) {
        super(context, null);
        this.g0 = new Rect();
        setActivity(activity);
    }

    @Override // org.telegram.ui.Components.st0
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.g0;
        getWindowVisibleDisplayFrame(rect);
        if (this.i0) {
            return ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.m)) {
            return 0;
        }
        return height;
    }

    @Override // org.telegram.ui.Components.st0
    public void R() {
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.h0 = Q();
        Point point = org.telegram.messenger.g0.q;
        post(new tp0(3, this, point.x > point.y));
    }

    @Override // org.telegram.ui.Components.st0
    public int getKeyboardHeight() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f0 = activity;
    }

    public void setWithoutWindow(boolean z9) {
        this.i0 = z9;
    }
}
