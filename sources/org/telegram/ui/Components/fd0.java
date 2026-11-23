package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fd0 extends NestedScrollView {
    public View a0;
    public final /* synthetic */ md0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(md0 md0Var, Activity activity) {
        super(activity);
        this.b0 = md0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.a0 == null || this.b0.o1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c10 = super.c(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.a0.getTop() - getScrollY()) + rect.top) + c10);
        return currentActionBarHeight > 0 ? org.telegram.messenger.o10.x(10.0f, currentActionBarHeight, c10) : c10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
