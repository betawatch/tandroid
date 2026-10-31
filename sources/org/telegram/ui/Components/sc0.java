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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ zc0 d;

    public sc0(zc0 zc0Var, int i10, int i11, Runnable runnable) {
        this.d = zc0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int L;
        org.telegram.ui.Cells.a5 a5Var;
        ei0 ei0Var;
        AnimatorSet animatorSet;
        zc0 zc0Var = this.d;
        org.telegram.ui.Cells.a5 a5Var2 = zc0Var.e;
        ArrayList arrayList = zc0Var.W;
        int[] iArr = zc0Var.h0;
        ei0 ei0Var2 = zc0Var.M;
        zc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (zc0Var.P || !zc0Var.isAttachedToWindow()) {
            return;
        }
        zc0Var.setAlpha(1.0f);
        int i10 = 0;
        ei0Var2.getAnimatedDrawable().N(0, false, false);
        ei0Var2.getAnimatedDrawable().P(37);
        ei0Var2.d();
        zc0Var.o(true);
        org.telegram.messenger.i0.h3(new eb0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        zc0Var.Q = animatorSet2;
        ArrayList arrayList2 = new ArrayList();
        Point point = org.telegram.messenger.i0.q;
        int i11 = point.x;
        int i12 = point.y + org.telegram.messenger.i0.m;
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
        ei0 ei0Var3 = ei0Var2;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i21)), Math.sqrt(i21 + i15));
        arrayList.clear();
        int childCount = a5Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = a5Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            vc0 vc0Var = new vc0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr[i20]);
            int i23 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            vc0Var.b = ((float) Math.sqrt(i23)) - org.telegram.messenger.i0.L(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                a5Var = a5Var2;
                int i24 = i20;
                float[] fArr = new float[i24];
                fArr[0] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr);
                Property property2 = View.SCALE_Y;
                float[] fArr2 = new float[i24];
                fArr2[0] = 1.0f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2);
                Animator[] animatorArr = new Animator[2];
                animatorArr[0] = ofFloat;
                animatorArr[i24] = ofFloat2;
                animatorSet.playTogether(animatorArr);
                ei0Var = ei0Var3;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                a5Var = a5Var2;
                ei0Var = ei0Var3;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            vc0Var.a = animatorSet3;
            ei0 ei0Var4 = ei0Var;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            vc0Var.a.addListener(new t60(animatorSet, 7));
            vc0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            vc0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(vc0Var);
            i22++;
            arrayList2 = arrayList3;
            a5Var2 = a5Var;
            ei0Var3 = ei0Var4;
            i20 = 1;
        }
        ArrayList arrayList4 = arrayList2;
        ei0 ei0Var5 = ei0Var3;
        arrayList4.add(ObjectAnimator.ofFloat(zc0Var.w, (Property<fg.i, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList4.add(ofFloat3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.qc0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zc0 zc0Var2 = sc0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i25 = 0;
                while (true) {
                    ArrayList arrayList5 = zc0Var2.W;
                    if (i25 >= arrayList5.size()) {
                        return;
                    }
                    vc0 vc0Var2 = (vc0) arrayList5.get(i25);
                    if (vc0Var2.b <= animatedFraction) {
                        vc0Var2.a.start();
                        arrayList5.remove(i25);
                        i25--;
                    }
                    i25++;
                }
            }
        });
        gr grVar = gr.h;
        animatorSet2.setInterpolator(grVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(zc0Var.a0, 1.0f);
        ofFloat4.addUpdateListener(new r60(this, 2));
        ofFloat4.addListener(new rc0(this, i10));
        ofFloat4.setDuration(420L);
        ofFloat4.setInterpolator(grVar);
        arrayList4.add(ofFloat4);
        animatorSet2.playTogether(arrayList4);
        animatorSet2.addListener(new rc0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        zc0Var.R = animatorSet4;
        animatorSet4.setDuration(332L);
        if (org.telegram.messenger.i0.Q1() || zc0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            L = org.telegram.messenger.i0.L(29.0f);
        } else {
            f7 = (org.telegram.messenger.tz.r == 0 ? i11 / 2.0f : i11) / 2.0f;
            L = org.telegram.messenger.i0.L(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(ei0Var5, (Property<ei0, Float>) View.TRANSLATION_X, i13 - org.telegram.messenger.i0.L(29.0f), f7 - L), ObjectAnimator.ofFloat(ei0Var5, (Property<ei0, Float>) View.TRANSLATION_Y, i16 - org.telegram.messenger.i0.L(29.0f), zc0Var.L), ObjectAnimator.ofFloat(ei0Var5, (Property<ei0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ei0Var5, (Property<ei0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(gr.g);
        animatorSet4.start();
    }
}
