package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ed0 extends NestedScrollView {
    public View a0;
    public final /* synthetic */ ld0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(ld0 ld0Var, Activity activity) {
        super(activity);
        this.b0 = ld0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.a0 == null || this.b0.o1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c10 = super.c(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.a0.getTop() - getScrollY()) + rect.top) + c10);
        return currentActionBarHeight > 0 ? org.telegram.messenger.n10.x(10.0f, currentActionBarHeight, c10) : c10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
