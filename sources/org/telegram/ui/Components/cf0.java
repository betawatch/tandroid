package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cf0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ kf0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(kf0 kf0Var, Activity activity) {
        super(activity);
        this.a0 = kf0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int e(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int e = super.e(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e);
        return currentActionBarHeight > 0 ? org.telegram.messenger.wh.z(10.0f, currentActionBarHeight, e) : e;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
