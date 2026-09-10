package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qe0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ ye0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(ye0 ye0Var, Activity activity) {
        super(activity);
        this.a0 = ye0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f7 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
        return currentActionBarHeight > 0 ? org.telegram.messenger.em.v(10.0f, currentActionBarHeight, f7) : f7;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
