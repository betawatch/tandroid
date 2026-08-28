package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class od0 extends NestedScrollView {
    public View S;
    public final /* synthetic */ wd0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(wd0 wd0Var, Activity activity) {
        super(activity);
        this.T = wd0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.S == null || this.T.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f10 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.S.getTop() - getScrollY()) + rect.top) + f10);
        return currentActionBarHeight > 0 ? org.telegram.messenger.ll.w(10.0f, currentActionBarHeight, f10) : f10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.S = view2;
        super.requestChildFocus(view, view2);
    }
}
