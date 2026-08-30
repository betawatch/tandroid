package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ke0 extends NestedScrollView {
    public View T;
    public final /* synthetic */ se0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(se0 se0Var, Activity activity) {
        super(activity);
        this.U = se0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.T == null || this.U.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f10 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.T.getTop() - getScrollY()) + rect.top) + f10);
        return currentActionBarHeight > 0 ? org.telegram.ui.b.t(10.0f, currentActionBarHeight, f10) : f10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.T = view2;
        super.requestChildFocus(view, view2);
    }
}
