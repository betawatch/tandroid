package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class te0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ bf0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(bf0 bf0Var, Activity activity) {
        super(activity);
        this.a0 = bf0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int e(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int e7 = super.e(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e7);
        return currentActionBarHeight > 0 ? org.telegram.messenger.ok.y(10.0f, currentActionBarHeight, e7) : e7;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
