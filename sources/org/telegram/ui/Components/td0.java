package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class td0 extends NestedScrollView {
    public View S;
    public final /* synthetic */ be0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(be0 be0Var, Activity activity) {
        super(activity, null);
        this.T = be0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.S == null || this.T.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f10 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.S.getTop() - getScrollY()) + rect.top) + f10);
        return currentActionBarHeight > 0 ? org.telegram.messenger.rl.u(10.0f, currentActionBarHeight, f10) : f10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.S = view2;
        super.requestChildFocus(view, view2);
    }
}
