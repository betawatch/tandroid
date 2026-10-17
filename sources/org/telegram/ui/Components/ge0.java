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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ge0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ le0 d;

    public ge0(le0 le0Var, int i10, int i11, Runnable runnable) {
        this.d = le0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        ci.i4 i4Var;
        xj0 xj0Var;
        AnimatorSet animatorSet;
        le0 le0Var = this.d;
        ci.i4 i4Var2 = le0Var.e;
        ArrayList arrayList = le0Var.W;
        int[] iArr = le0Var.h0;
        xj0 xj0Var2 = le0Var.M;
        le0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (le0Var.P || !le0Var.isAttachedToWindow()) {
            return;
        }
        le0Var.setAlpha(1.0f);
        int i10 = 0;
        xj0Var2.getAnimatedDrawable().N(0, false, false);
        xj0Var2.getAnimatedDrawable().P(37);
        xj0Var2.d();
        le0Var.n(true);
        AndroidUtilities.runOnUIThread(new rc0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        le0Var.Q = animatorSet2;
        ArrayList arrayList2 = new ArrayList();
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
        int i20 = 1;
        double sqrt2 = Math.sqrt(i18 + i19);
        int i21 = i16 * i16;
        xj0 xj0Var3 = xj0Var2;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i21)), Math.sqrt(i21 + i15));
        arrayList.clear();
        int childCount = i4Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = i4Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ie0 ie0Var = new ie0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr[i20]);
            int i23 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            ie0Var.b = ((float) Math.sqrt(i23)) - AndroidUtilities.dp(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                i4Var = i4Var2;
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
                xj0Var = xj0Var3;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                i4Var = i4Var2;
                xj0Var = xj0Var3;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ie0Var.a = animatorSet3;
            xj0 xj0Var4 = xj0Var;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            ie0Var.a.addListener(new c80(animatorSet, 7));
            ie0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            ie0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(ie0Var);
            i22++;
            arrayList2 = arrayList3;
            i4Var2 = i4Var;
            xj0Var3 = xj0Var4;
            i20 = 1;
        }
        ArrayList arrayList4 = arrayList2;
        xj0 xj0Var5 = xj0Var3;
        arrayList4.add(ObjectAnimator.ofFloat(le0Var.v, (Property<ah.v, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList4.add(ofFloat3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ee0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                le0 le0Var2 = ge0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i25 = 0;
                while (true) {
                    ArrayList arrayList5 = le0Var2.W;
                    if (i25 >= arrayList5.size()) {
                        return;
                    }
                    ie0 ie0Var2 = (ie0) arrayList5.get(i25);
                    if (ie0Var2.b <= animatedFraction) {
                        ie0Var2.a.start();
                        arrayList5.remove(i25);
                        i25--;
                    }
                    i25++;
                }
            }
        });
        bs bsVar = bs.h;
        animatorSet2.setInterpolator(bsVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(le0Var.a0, 1.0f);
        ofFloat4.addUpdateListener(new b80(this, 3));
        ofFloat4.addListener(new fe0(this, i10));
        ofFloat4.setDuration(420L);
        ofFloat4.setInterpolator(bsVar);
        arrayList4.add(ofFloat4);
        animatorSet2.playTogether(arrayList4);
        animatorSet2.addListener(new fe0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        le0Var.R = animatorSet4;
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || le0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(xj0Var5, (Property<xj0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(xj0Var5, (Property<xj0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), le0Var.L), ObjectAnimator.ofFloat(xj0Var5, (Property<xj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(xj0Var5, (Property<xj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(bs.g);
        animatorSet4.start();
    }
}
