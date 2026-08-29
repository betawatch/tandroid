package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ce0 extends NestedScrollView {
    public View S;
    public final /* synthetic */ ke0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(ke0 ke0Var, Activity activity) {
        super(activity);
        this.T = ke0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.S == null || this.T.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f9 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - (((this.S.getTop() - getScrollY()) + rect.top) + f9);
        return currentActionBarHeight > 0 ? org.telegram.ui.b.u(10.0f, currentActionBarHeight, f9) : f9;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.S = view2;
        super.requestChildFocus(view, view2);
    }
}
