package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zb0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ fc0 d;

    public zb0(fc0 fc0Var, int i7, int i10, Runnable runnable) {
        this.d = fc0Var;
        this.a = i7;
        this.b = i10;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f10;
        int L;
        di.b4 b4Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        fc0 fc0Var = this.d;
        di.b4 b4Var2 = fc0Var.e;
        ArrayList arrayList = fc0Var.W;
        int[] iArr2 = fc0Var.h0;
        dh0 dh0Var = fc0Var.M;
        fc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (fc0Var.P || !fc0Var.isAttachedToWindow()) {
            return;
        }
        fc0Var.setAlpha(1.0f);
        int i7 = 0;
        dh0Var.getAnimatedDrawable().N(0, false, false);
        dh0Var.getAnimatedDrawable().P(37);
        dh0Var.d();
        fc0Var.o(true);
        org.telegram.messenger.g0.i3(new pb0(this, 1), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        fc0Var.Q = animatorSet2;
        ArrayList arrayList2 = new ArrayList();
        Point point = org.telegram.messenger.g0.q;
        int i10 = point.x;
        int i11 = point.y + org.telegram.messenger.g0.m;
        int i12 = this.a;
        int i13 = i10 - i12;
        int i14 = i13 * i13;
        int i15 = this.b;
        int i16 = i11 - i15;
        int i17 = i16 * i16;
        int i18 = i12 * i12;
        int i19 = 1;
        int i20 = i15 * i15;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i17 + i14), Math.sqrt(i17 + i18)), Math.sqrt(i18 + i20)), Math.sqrt(i20 + i14));
        arrayList.clear();
        int childCount = b4Var2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = b4Var2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            bc0 bc0Var = new bc0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr2[i19]);
            bc0Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                b4Var = b4Var2;
                float[] fArr = new float[i19];
                fArr[0] = 1.0f;
                view = childAt;
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                d = max;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                b4Var = b4Var2;
                iArr = iArr2;
                d = max;
                view = childAt;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            bc0Var.a = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, i21 == -1 ? 0.9f : 0.6f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, i21 == -1 ? 0.9f : 0.6f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            bc0Var.a.addListener(new f60(animatorSet, 7));
            bc0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            bc0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(bc0Var);
            i21++;
            b4Var2 = b4Var;
            iArr2 = iArr;
            max = d;
            i19 = 1;
        }
        final double d2 = max;
        arrayList2.add(ObjectAnimator.ofFloat(fc0Var.w, (Property<bi.x5, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                fc0 fc0Var2 = zb0.this.d;
                double animatedFraction = d2 * valueAnimator.getAnimatedFraction();
                int i22 = 0;
                while (true) {
                    ArrayList arrayList3 = fc0Var2.W;
                    if (i22 >= arrayList3.size()) {
                        return;
                    }
                    bc0 bc0Var2 = (bc0) arrayList3.get(i22);
                    if (bc0Var2.b <= animatedFraction) {
                        bc0Var2.a.start();
                        arrayList3.remove(i22);
                        i22--;
                    }
                    i22++;
                }
            }
        });
        xq xqVar = xq.h;
        animatorSet2.setInterpolator(xqVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fc0Var.a0, 1.0f);
        ofFloat2.addUpdateListener(new d60(this, 2));
        ofFloat2.addListener(new yb0(this, i7));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(xqVar);
        arrayList2.add(ofFloat2);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new yb0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        fc0Var.R = animatorSet4;
        animatorSet4.setDuration(332L);
        if (org.telegram.messenger.g0.Q1() || fc0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i10 / 2.0f;
            L = org.telegram.messenger.g0.L(29.0f);
        } else {
            f10 = (org.telegram.messenger.iz.r == 0 ? i10 / 2.0f : i10) / 2.0f;
            L = org.telegram.messenger.g0.L(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) View.TRANSLATION_X, i12 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) View.TRANSLATION_Y, i15 - org.telegram.messenger.g0.L(29.0f), fc0Var.L), ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(dh0Var, (Property<dh0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(xq.g);
        animatorSet4.start();
    }
}
