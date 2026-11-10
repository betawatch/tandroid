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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bb1 extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final /* synthetic */ cb1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb1(cb1 cb1Var, Context context) {
        super(context);
        this.d = cb1Var;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.c = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i7, i10, i11, i12);
        cb1 cb1Var = this.d;
        TextView textView = cb1Var.c;
        if (textView == null) {
            return;
        }
        int[] iArr = this.a;
        textView.getLocationOnScreen(iArr);
        int measuredHeight = cb1Var.c.getMeasuredHeight() + iArr[1];
        lVar = ((org.telegram.ui.ActionBar.f2) cb1Var).actionBar;
        boolean z9 = measuredHeight < lVar.getBottom();
        if (z9 != (cb1Var.c.getTag() == null)) {
            cb1Var.c.setTag(z9 ? null : 1);
            AnimatorSet animatorSet = cb1Var.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                cb1Var.K = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            cb1Var.K = animatorSet2;
            fi.p5 p5Var = cb1Var.D;
            float[] fArr = {z9 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) property, fArr);
            lVar2 = ((org.telegram.ui.ActionBar.f2) cb1Var).actionBar;
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(lVar2.getTitleTextView(), (Property<org.telegram.ui.ActionBar.m5, Float>) property, z9 ? 1.0f : 0.0f));
            cb1Var.K.setDuration(150L);
            cb1Var.K.addListener(new u81(this, 2));
            cb1Var.K.start();
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
        rect.bottom = org.telegram.messenger.g0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
