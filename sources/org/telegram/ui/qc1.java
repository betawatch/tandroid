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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qc1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final /* synthetic */ rc1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(rc1 rc1Var, Context context) {
        super(context);
        this.d = rc1Var;
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
        rc1 rc1Var = this.d;
        TextView textView = rc1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = rc1Var.c.getMeasuredHeight() + iArr[1];
        lVar = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
        boolean z10 = measuredHeight < lVar.getBottom();
        if (z10 != (rc1Var.c.getTag() == null)) {
            rc1Var.c.setTag(z10 ? null : 1);
            AnimatorSet animatorSet = rc1Var.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                rc1Var.K = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            rc1Var.K = animatorSet2;
            kg.f0 f0Var = rc1Var.D;
            float[] fArr = {z10 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property, fArr);
            lVar2 = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(lVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.u5, Float>) property, z10 ? 1.0f : 0.0f));
            rc1Var.K.setDuration(150L);
            rc1Var.K.addListener(new ms0(this, 13));
            rc1Var.K.start();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
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
        rect.bottom = org.telegram.messenger.i0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
