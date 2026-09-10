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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ be0 d;

    public wd0(be0 be0Var, int i10, int i11, Runnable runnable) {
        this.d = be0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        int[] iArr;
        bi.l4 l4Var;
        int i10;
        AnimatorSet animatorSet;
        be0 be0Var = this.d;
        int[] iArr2 = be0Var.W;
        be0Var.setAlpha(1.0f);
        be0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        kj0 kj0Var = be0Var.I;
        kj0Var.getAnimatedDrawable().N(0, false, false);
        kj0Var.getAnimatedDrawable().P(37);
        kj0Var.d();
        char c10 = 1;
        be0Var.m(true);
        AndroidUtilities.runOnUIThread(new kc0(this, 4), 350L);
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
        ArrayList arrayList2 = be0Var.O;
        arrayList2.clear();
        bi.l4 l4Var2 = be0Var.e;
        int childCount = l4Var2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = l4Var2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            yd0 yd0Var = new yd0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            yd0Var.b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                l4Var = l4Var2;
                i10 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                l4Var = l4Var2;
                i10 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            yd0Var.a = animatorSet3;
            bi.l4 l4Var3 = l4Var;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i21 == -1 ? 0.9f : 0.6f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i21 != -1 ? 0.6f : 0.9f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            yd0Var.a.addListener(new rm(animatorSet, 21));
            yd0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            yd0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(yd0Var);
            i21++;
            arrayList2 = arrayList3;
            childCount = i10;
            iArr2 = iArr;
            l4Var2 = l4Var3;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(be0Var.v, (Property<bi.n7, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ud0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                be0 be0Var2 = wd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList4 = be0Var2.O;
                    if (i23 >= arrayList4.size()) {
                        return;
                    }
                    yd0 yd0Var2 = (yd0) arrayList4.get(i23);
                    if (yd0Var2.b <= animatedFraction) {
                        yd0Var2.a.start();
                        arrayList4.remove(i23);
                        i23--;
                    }
                    i23++;
                }
            }
        });
        wr wrVar = wr.h;
        animatorSet2.setInterpolator(wrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(be0Var.P, 1.0f);
        ofFloat2.addUpdateListener(new q70(this, 2));
        ofFloat2.addListener(new vd0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(wrVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new vd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || be0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), be0Var.H), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(wr.g);
        animatorSet4.start();
    }
}
