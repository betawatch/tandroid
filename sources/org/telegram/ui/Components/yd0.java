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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ de0 d;

    public yd0(de0 de0Var, int i10, int i11, Runnable runnable) {
        this.d = de0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        int[] iArr;
        ai.x5 x5Var;
        int i10;
        int i11;
        AnimatorSet animatorSet;
        de0 de0Var = this.d;
        int[] iArr2 = de0Var.W;
        de0Var.setAlpha(1.0f);
        de0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        nj0 nj0Var = de0Var.I;
        nj0Var.getAnimatedDrawable().N(0, false, false);
        nj0Var.getAnimatedDrawable().P(37);
        nj0Var.d();
        de0Var.m(true);
        AndroidUtilities.runOnUIThread(new jc0(this, 5), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        int i13 = point.y + AndroidUtilities.statusBarHeight;
        int i14 = this.a;
        int i15 = i12 - i14;
        int i16 = i15 * i15;
        int i17 = this.b;
        int i18 = i13 - i17;
        int i19 = i18 * i18;
        double sqrt = Math.sqrt(i19 + i16);
        double sqrt2 = Math.sqrt(i19 + r16);
        int i20 = i17 * i17;
        int i21 = i20 + (i14 * i14);
        char c10 = 1;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i21)), Math.sqrt(i20 + i16));
        ArrayList arrayList2 = de0Var.O;
        arrayList2.clear();
        ai.x5 x5Var2 = de0Var.e;
        int childCount = x5Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = x5Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ae0 ae0Var = new ae0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i14 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i17 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i23 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            int i24 = i17;
            ae0Var.b = ((float) Math.sqrt(i23)) - AndroidUtilities.dp(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                x5Var = x5Var2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                i10 = childCount;
                i11 = i12;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                x5Var = x5Var2;
                i10 = childCount;
                i11 = i12;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ae0Var.a = animatorSet3;
            int i25 = i11;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            ae0Var.a.addListener(new gd0(animatorSet, 2));
            ae0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            ae0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList2.add(ae0Var);
            i22++;
            childCount = i10;
            i17 = i24;
            iArr2 = iArr;
            x5Var2 = x5Var;
            i12 = i25;
            c10 = 1;
        }
        int i26 = i12;
        int i27 = i17;
        arrayList.add(ObjectAnimator.ofFloat(de0Var.v, (Property<ci.n6, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.wd0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                de0 de0Var2 = yd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i28 = 0;
                while (true) {
                    ArrayList arrayList3 = de0Var2.O;
                    if (i28 >= arrayList3.size()) {
                        return;
                    }
                    ae0 ae0Var2 = (ae0) arrayList3.get(i28);
                    if (ae0Var2.b <= animatedFraction) {
                        ae0Var2.a.start();
                        arrayList3.remove(i28);
                        i28--;
                    }
                    i28++;
                }
            }
        });
        qr qrVar = qr.h;
        animatorSet2.setInterpolator(qrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(de0Var.P, 1.0f);
        ofFloat2.addUpdateListener(new s70(this, 2));
        ofFloat2.addListener(new xd0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(qrVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new xd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || de0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i26 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i26 / 2.0f : i26) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) View.TRANSLATION_X, i14 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) View.TRANSLATION_Y, i27 - AndroidUtilities.dp(29.0f), de0Var.H), ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(nj0Var, (Property<nj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(qr.g);
        animatorSet4.start();
    }
}
