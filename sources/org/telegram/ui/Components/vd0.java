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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ ae0 d;

    public vd0(ae0 ae0Var, int i10, int i11, Runnable runnable) {
        this.d = ae0Var;
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
        AnimatorSet animatorSet;
        ae0 ae0Var = this.d;
        int[] iArr2 = ae0Var.W;
        ae0Var.setAlpha(1.0f);
        ae0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        kj0 kj0Var = ae0Var.I;
        kj0Var.getAnimatedDrawable().N(0, false, false);
        kj0Var.getAnimatedDrawable().P(37);
        kj0Var.d();
        char c10 = 1;
        ae0Var.m(true);
        AndroidUtilities.runOnUIThread(new jc0(this, 4), 350L);
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
        ArrayList arrayList2 = ae0Var.O;
        arrayList2.clear();
        ai.x5 x5Var2 = ae0Var.e;
        int childCount = x5Var2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = x5Var2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            xd0 xd0Var = new xd0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            xd0Var.b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                x5Var = x5Var2;
                i10 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                x5Var = x5Var2;
                i10 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            xd0Var.a = animatorSet3;
            ai.x5 x5Var3 = x5Var;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i21 == -1 ? 0.9f : 0.6f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i21 != -1 ? 0.6f : 0.9f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            xd0Var.a.addListener(new dd0(animatorSet, 2));
            xd0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            xd0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(xd0Var);
            i21++;
            arrayList2 = arrayList3;
            childCount = i10;
            iArr2 = iArr;
            x5Var2 = x5Var3;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(ae0Var.v, (Property<ci.n6, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.td0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ae0 ae0Var2 = vd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList4 = ae0Var2.O;
                    if (i23 >= arrayList4.size()) {
                        return;
                    }
                    xd0 xd0Var2 = (xd0) arrayList4.get(i23);
                    if (xd0Var2.b <= animatedFraction) {
                        xd0Var2.a.start();
                        arrayList4.remove(i23);
                        i23--;
                    }
                    i23++;
                }
            }
        });
        qr qrVar = qr.h;
        animatorSet2.setInterpolator(qrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ae0Var.P, 1.0f);
        ofFloat2.addUpdateListener(new p70(this, 2));
        ofFloat2.addListener(new ud0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(qrVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new ud0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || ae0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), ae0Var.H), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(qr.g);
        animatorSet4.start();
    }
}
