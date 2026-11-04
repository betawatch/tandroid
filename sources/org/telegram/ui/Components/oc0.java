package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oc0 extends NestedScrollView {
    public View a0;
    public final /* synthetic */ vc0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(vc0 vc0Var, Activity activity) {
        super(activity);
        this.b0 = vc0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.a0 == null || this.b0.l1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c2 = super.c(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.a0.getTop() - getScrollY()) + rect.top) + c2);
        return currentActionBarHeight > 0 ? org.telegram.messenger.camera.q.w(10.0f, currentActionBarHeight, c2) : c2;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
