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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        bi.v1 v1Var;
        int i7;
        AnimatorSet animatorSet;
        fc0 fc0Var = this.d;
        bi.v1 v1Var2 = fc0Var.e;
        ArrayList arrayList = fc0Var.a0;
        int[] iArr = fc0Var.i0;
        fh0 fh0Var = fc0Var.N;
        fc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (fc0Var.Q || !fc0Var.isAttachedToWindow()) {
            return;
        }
        fc0Var.setAlpha(1.0f);
        int i10 = 0;
        fh0Var.getAnimatedDrawable().N(0, false, false);
        fh0Var.getAnimatedDrawable().P(37);
        fh0Var.d();
        fc0Var.o(true);
        org.telegram.messenger.g0.i3(new wa0(this, 3), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        fc0Var.R = animatorSet2;
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
        int childCount = v1Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = v1Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            bc0 bc0Var = new bc0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr[i20]);
            bc0Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                v1Var = v1Var2;
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
                v1Var = v1Var2;
                i7 = i11;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            bc0Var.a = animatorSet3;
            int i24 = i7;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            bc0Var.a.addListener(new h60(animatorSet, 7));
            bc0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            bc0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(bc0Var);
            i22++;
            v1Var2 = v1Var;
            i11 = i24;
            i20 = 1;
        }
        int i25 = i11;
        arrayList2.add(ObjectAnimator.ofFloat(fc0Var.w, (Property<ai.k0, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                fc0 fc0Var2 = zb0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i26 = 0;
                while (true) {
                    ArrayList arrayList3 = fc0Var2.a0;
                    if (i26 >= arrayList3.size()) {
                        return;
                    }
                    bc0 bc0Var2 = (bc0) arrayList3.get(i26);
                    if (bc0Var2.b <= animatedFraction) {
                        bc0Var2.a.start();
                        arrayList3.remove(i26);
                        i26--;
                    }
                    i26++;
                }
            }
        });
        er erVar = er.h;
        animatorSet2.setInterpolator(erVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fc0Var.b0, 1.0f);
        ofFloat4.addUpdateListener(new f60(this, 2));
        ofFloat4.addListener(new yb0(this, i10));
        ofFloat4.setDuration(420L);
        ofFloat4.setInterpolator(erVar);
        arrayList2.add(ofFloat4);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new yb0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        fc0Var.S = animatorSet4;
        animatorSet4.setDuration(332L);
        if (org.telegram.messenger.g0.Q1() || fc0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i25 / 2.0f;
            L = org.telegram.messenger.g0.L(29.0f);
        } else {
            f10 = (org.telegram.messenger.gz.r == 0 ? i25 / 2.0f : i25) / 2.0f;
            L = org.telegram.messenger.g0.L(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) View.TRANSLATION_X, i13 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) View.TRANSLATION_Y, i16 - org.telegram.messenger.g0.L(29.0f), fc0Var.M), ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(er.g);
        animatorSet4.start();
    }
}
