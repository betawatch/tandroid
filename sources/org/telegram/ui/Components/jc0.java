package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ pc0 d;

    public jc0(pc0 pc0Var, int i7, int i10, Runnable runnable) {
        this.d = pc0Var;
        this.a = i7;
        this.b = i10;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f10;
        int L;
        bi.p2 p2Var;
        int i7;
        AnimatorSet animatorSet;
        pc0 pc0Var = this.d;
        bi.p2 p2Var2 = pc0Var.e;
        ArrayList arrayList = pc0Var.a0;
        int[] iArr = pc0Var.i0;
        ph0 ph0Var = pc0Var.N;
        pc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (pc0Var.Q || !pc0Var.isAttachedToWindow()) {
            return;
        }
        pc0Var.setAlpha(1.0f);
        int i10 = 0;
        ph0Var.getAnimatedDrawable().N(0, false, false);
        ph0Var.getAnimatedDrawable().P(37);
        ph0Var.d();
        pc0Var.o(true);
        org.telegram.messenger.g0.h3(new gb0(this, 3), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        pc0Var.R = animatorSet2;
        ArrayList arrayList2 = new ArrayList();
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x;
        int i12 = point.y + org.telegram.messenger.g0.m;
        int i13 = this.a;
        int i14 = i11 - i13;
        int i15 = i14 * i14;
        int i16 = this.b;
        int i17 = i12 - i16;
        int i18 = i17 * i17;
        double sqrt = Math.sqrt(i18 + i15);
        int i19 = i13 * i13;
        int i20 = 1;
        double sqrt2 = Math.sqrt(i18 + i19);
        int i21 = i16 * i16;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i21 + i19)), Math.sqrt(i21 + i15));
        arrayList.clear();
        int childCount = p2Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = p2Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            lc0 lc0Var = new lc0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr[i20]);
            lc0Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                p2Var = p2Var2;
                int i23 = i20;
                float[] fArr = new float[i23];
                fArr[0] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr);
                Property property2 = View.SCALE_Y;
                float[] fArr2 = new float[i23];
                fArr2[0] = 1.0f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2);
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = ofFloat;
                animatorArr[i23] = ofFloat2;
                animatorSet.playTogether(animatorArr);
                i7 = i11;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                p2Var = p2Var2;
                i7 = i11;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            lc0Var.a = animatorSet3;
            int i24 = i7;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            lc0Var.a.addListener(new q60(animatorSet, 7));
            lc0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            lc0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(lc0Var);
            i22++;
            p2Var2 = p2Var;
            i11 = i24;
            i20 = 1;
        }
        int i25 = i11;
        arrayList2.add(ObjectAnimator.ofFloat(pc0Var.w, (Property<ai.k0, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hc0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pc0 pc0Var2 = jc0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i26 = 0;
                while (true) {
                    ArrayList arrayList3 = pc0Var2.a0;
                    if (i26 >= arrayList3.size()) {
                        return;
                    }
                    lc0 lc0Var2 = (lc0) arrayList3.get(i26);
                    if (lc0Var2.b <= animatedFraction) {
                        lc0Var2.a.start();
                        arrayList3.remove(i26);
                        i26--;
                    }
                    i26++;
                }
            }
        });
        lr lrVar = lr.h;
        animatorSet2.setInterpolator(lrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(pc0Var.b0, 1.0f);
        ofFloat4.addUpdateListener(new e60(this, 4));
        ofFloat4.addListener(new ic0(this, i10));
        ofFloat4.setDuration(420L);
        ofFloat4.setInterpolator(lrVar);
        arrayList2.add(ofFloat4);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new ic0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        pc0Var.S = animatorSet4;
        animatorSet4.setDuration(332L);
        if (org.telegram.messenger.g0.Q1() || pc0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i25 / 2.0f;
            L = org.telegram.messenger.g0.L(29.0f);
        } else {
            f10 = (org.telegram.messenger.bz.r == 0 ? i25 / 2.0f : i25) / 2.0f;
            L = org.telegram.messenger.g0.L(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(ph0Var, (Property<ph0, Float>) View.TRANSLATION_X, i13 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(ph0Var, (Property<ph0, Float>) View.TRANSLATION_Y, i16 - org.telegram.messenger.g0.L(29.0f), pc0Var.M), ObjectAnimator.ofFloat(ph0Var, (Property<ph0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ph0Var, (Property<ph0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(lr.g);
        animatorSet4.start();
    }
}
