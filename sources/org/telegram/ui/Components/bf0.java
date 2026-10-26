package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bf0 extends NestedScrollView {
    public View W;
    public final /* synthetic */ jf0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(jf0 jf0Var, Activity activity) {
        super(activity);
        this.a0 = jf0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int e(Rect rect) {
        if (this.W == null || this.a0.d.getTop() != getPaddingTop()) {
            return 0;
        }
        int e = super.e(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.W.getTop() - getScrollY()) + rect.top) + e);
        return currentActionBarHeight > 0 ? org.telegram.messenger.vh.z(10.0f, currentActionBarHeight, e) : e;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.W = view2;
        super.requestChildFocus(view, view2);
    }
}
