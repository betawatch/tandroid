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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class xd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ ce0 d;

    public xd0(ce0 ce0Var, int i10, int i11, Runnable runnable) {
        this.d = ce0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        int[] iArr;
        ai.w5 w5Var;
        int i10;
        int i11;
        AnimatorSet animatorSet;
        ce0 ce0Var = this.d;
        int[] iArr2 = ce0Var.W;
        ce0Var.setAlpha(1.0f);
        ce0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        lj0 lj0Var = ce0Var.I;
        lj0Var.getAnimatedDrawable().N(0, false, false);
        lj0Var.getAnimatedDrawable().P(37);
        lj0Var.d();
        ce0Var.m(true);
        AndroidUtilities.runOnUIThread(new ic0(this, 5), 350L);
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
        ArrayList arrayList2 = ce0Var.O;
        arrayList2.clear();
        ai.w5 w5Var2 = ce0Var.e;
        int childCount = w5Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = w5Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            zd0 zd0Var = new zd0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i14 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i17 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i23 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            int i24 = i17;
            zd0Var.b = ((float) Math.sqrt(i23)) - AndroidUtilities.dp(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                w5Var = w5Var2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                i10 = childCount;
                i11 = i12;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                w5Var = w5Var2;
                i10 = childCount;
                i11 = i12;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            zd0Var.a = animatorSet3;
            int i25 = i11;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            zd0Var.a.addListener(new fd0(animatorSet, 2));
            zd0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            zd0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList2.add(zd0Var);
            i22++;
            childCount = i10;
            i17 = i24;
            iArr2 = iArr;
            w5Var2 = w5Var;
            i12 = i25;
            c10 = 1;
        }
        int i26 = i12;
        int i27 = i17;
        arrayList.add(ObjectAnimator.ofFloat(ce0Var.v, (Property<ci.m6, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.vd0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ce0 ce0Var2 = xd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i28 = 0;
                while (true) {
                    ArrayList arrayList3 = ce0Var2.O;
                    if (i28 >= arrayList3.size()) {
                        return;
                    }
                    zd0 zd0Var2 = (zd0) arrayList3.get(i28);
                    if (zd0Var2.b <= animatedFraction) {
                        zd0Var2.a.start();
                        arrayList3.remove(i28);
                        i28--;
                    }
                    i28++;
                }
            }
        });
        rr rrVar = rr.h;
        animatorSet2.setInterpolator(rrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ce0Var.P, 1.0f);
        ofFloat2.addUpdateListener(new s70(this, 2));
        ofFloat2.addListener(new wd0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(rrVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new wd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || ce0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i26 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i26 / 2.0f : i26) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(lj0Var, (Property<lj0, Float>) View.TRANSLATION_X, i14 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(lj0Var, (Property<lj0, Float>) View.TRANSLATION_Y, i27 - AndroidUtilities.dp(29.0f), ce0Var.H), ObjectAnimator.ofFloat(lj0Var, (Property<lj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(lj0Var, (Property<lj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(rr.g);
        animatorSet4.start();
    }
}
