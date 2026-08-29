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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class id0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ nd0 d;

    public id0(nd0 nd0Var, int i10, int i11, Runnable runnable) {
        this.d = nd0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f9;
        int dp;
        int[] iArr;
        bh.d dVar;
        int i10;
        AnimatorSet animatorSet;
        nd0 nd0Var = this.d;
        int[] iArr2 = nd0Var.S;
        nd0Var.setAlpha(1.0f);
        nd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        aj0 aj0Var = nd0Var.E;
        aj0Var.getAnimatedDrawable().L(0, false, false);
        aj0Var.getAnimatedDrawable().N(37);
        aj0Var.d();
        char c3 = 1;
        nd0Var.m(true);
        AndroidUtilities.runOnUIThread(new xb0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        int i12 = point.y + AndroidUtilities.statusBarHeight;
        int i13 = this.a;
        int i14 = i11 - i13;
        int i15 = i14 * i14;
        int i16 = this.b;
        int i17 = i12 - i16;
        int i18 = i17 * i17;
        double sqrt = Math.sqrt(i18 + i15);
        int i19 = i13 * i13;
        double sqrt2 = Math.sqrt(i18 + i19);
        int i20 = i16 * i16;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i20)), Math.sqrt(i20 + i15));
        ArrayList arrayList2 = nd0Var.K;
        arrayList2.clear();
        bh.d dVar2 = nd0Var.e;
        int childCount = dVar2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = dVar2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            kd0 kd0Var = new kd0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[c3]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            kd0Var.b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                dVar = dVar2;
                i10 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                dVar = dVar2;
                i10 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            kd0Var.a = animatorSet3;
            bh.d dVar3 = dVar;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i21 == -1 ? 0.9f : 0.6f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i21 != -1 ? 0.6f : 0.9f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            kd0Var.a.addListener(new zz(animatorSet, 9));
            kd0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            kd0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(kd0Var);
            i21++;
            arrayList2 = arrayList3;
            childCount = i10;
            iArr2 = iArr;
            dVar2 = dVar3;
            c3 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(nd0Var.v, (Property<bg.d1, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.gd0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nd0 nd0Var2 = id0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList4 = nd0Var2.K;
                    if (i23 >= arrayList4.size()) {
                        return;
                    }
                    kd0 kd0Var2 = (kd0) arrayList4.get(i23);
                    if (kd0Var2.b <= animatedFraction) {
                        kd0Var2.a.start();
                        arrayList4.remove(i23);
                        i23--;
                    }
                    i23++;
                }
            }
        });
        jr jrVar = jr.h;
        animatorSet2.setInterpolator(jrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(nd0Var.L, 1.0f);
        ofFloat2.addUpdateListener(new d70(this, 2));
        ofFloat2.addListener(new hd0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(jrVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new hd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || nd0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f9 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f9 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f9 - dp), ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), nd0Var.D), ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(aj0Var, (Property<aj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(jr.g);
        animatorSet4.start();
    }
}
