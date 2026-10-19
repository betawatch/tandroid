package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class af0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ if0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(if0 if0Var, Activity activity) {
        super(activity);
        this.a0 = if0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f7 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
        return currentActionBarHeight > 0 ? org.telegram.messenger.kk.y(10.0f, currentActionBarHeight, f7) : f7;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
