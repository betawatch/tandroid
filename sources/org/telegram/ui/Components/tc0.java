package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class tc0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ ad0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc0(ad0 ad0Var, Activity activity) {
        super(activity);
        this.a0 = ad0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.W == null || this.a0.k1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c10 = super.c(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + c10);
        return currentActionBarHeight > 0 ? org.telegram.messenger.camera.q.w(10.0f, currentActionBarHeight, c10) : c10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
