package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
    public final int f(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f7 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
        return currentActionBarHeight > 0 ? org.telegram.messenger.ok.y(10.0f, currentActionBarHeight, f7) : f7;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
