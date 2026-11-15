package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class uc0 extends NestedScrollView {
    public View a0;
    public final /* synthetic */ bd0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(bd0 bd0Var, Activity activity) {
        super(activity);
        this.b0 = bd0Var;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final int c(Rect rect) {
        if (this.a0 == null || this.b0.o1.getTop() != getPaddingTop()) {
            return 0;
        }
        int c10 = super.c(rect);
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - (((this.a0.getTop() - getScrollY()) + rect.top) + c10);
        return currentActionBarHeight > 0 ? org.telegram.messenger.i20.w(10.0f, currentActionBarHeight, c10) : c10;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.a0 = view2;
        super.requestChildFocus(view, view2);
    }
}
