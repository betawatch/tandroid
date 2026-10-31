package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class od0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ vd0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(vd0 vd0Var, Activity activity) {
        super(activity);
        this.a0 = vd0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int e(Rect rect) {
        if (this.W == null || this.a0.k1.getTop() != getPaddingTop()) {
            return 0;
        }
        int e = super.e(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e);
        return currentActionBarHeight > 0 ? org.telegram.messenger.z20.w(10.0f, currentActionBarHeight, e) : e;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
