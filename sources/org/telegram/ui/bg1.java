package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bg1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public int d;
    public final /* synthetic */ cg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(cg1 cg1Var, Context context) {
        super(context);
        this.e = cg1Var;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        cg1 cg1Var = this.e;
        TextView textView = cg1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = cg1Var.c.getMeasuredHeight() + iArr[1];
        lVar = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
        boolean z10 = measuredHeight < lVar.getBottom();
        if (z10 != (cg1Var.c.getTag() == null)) {
            cg1Var.c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = cg1Var.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                cg1Var.G = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            cg1Var.G = animatorSet2;
            cg.i0 i0Var = cg1Var.y;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property, fArr);
            lVar2 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(lVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 1.0f : 0.0f));
            cg1Var.G.setDuration(150L);
            cg1Var.G.addListener(new cc1(this, 3));
            cg1Var.G.start();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (Build.VERSION.SDK_INT < 23) {
            int dp = AndroidUtilities.dp(120.0f) + rect.bottom;
            rect.bottom = dp;
            int i10 = this.d;
            if (i10 != 0) {
                rect.top -= i10;
                rect.bottom = dp - i10;
                this.d = 0;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.widget.ScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.c = true;
        super.requestLayout();
    }

    @Override // android.widget.ScrollView
    public final void scrollToDescendant(View view) {
        Rect rect = this.b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            this.d = measuredHeight;
            computeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
        } else {
            this.d = 0;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
