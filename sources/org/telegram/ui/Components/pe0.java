package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pe0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ xe0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(xe0 xe0Var, Activity activity) {
        super(activity);
        this.a0 = xe0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int f(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int f7 = super.f(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + f7);
        return currentActionBarHeight > 0 ? org.telegram.messenger.rk.x(10.0f, currentActionBarHeight, f7) : f7;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
