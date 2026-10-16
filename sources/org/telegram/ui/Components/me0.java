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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class me0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ re0 d;

    public me0(re0 re0Var, int i10, int i11, Runnable runnable) {
        this.d = re0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        bi.i5 i5Var;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        re0 re0Var = this.d;
        bi.i5 i5Var2 = re0Var.e;
        ArrayList arrayList = re0Var.S;
        int[] iArr = re0Var.d0;
        bk0 bk0Var = re0Var.I;
        re0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (re0Var.L || !re0Var.isAttachedToWindow()) {
            return;
        }
        re0Var.setAlpha(1.0f);
        int i10 = 0;
        bk0Var.getAnimatedDrawable().N(0, false, false);
        bk0Var.getAnimatedDrawable().P(37);
        bk0Var.d();
        re0Var.n(true);
        AndroidUtilities.runOnUIThread(new yc0(this, 5), 350L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        re0Var.M = animatorSet3;
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
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i21 + i19)), Math.sqrt(i21 + i15));
        arrayList.clear();
        int childCount = i5Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = i5Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            oe0 oe0Var = new oe0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr[i20]);
            oe0Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - AndroidUtilities.dp(40.0f);
            if (i22 != -1) {
                animatorSet2 = new AnimatorSet();
                Property property = View.SCALE_X;
                i5Var = i5Var2;
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
                animatorSet2.playTogether(animatorArr);
                animatorSet = animatorSet3;
                animatorSet2.setDuration(140L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
            } else {
                i5Var = i5Var2;
                animatorSet = animatorSet3;
                animatorSet2 = null;
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            oe0Var.a = animatorSet4;
            AnimatorSet animatorSet5 = animatorSet;
            animatorSet4.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            oe0Var.a.addListener(new k90(animatorSet2, 5));
            oe0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            oe0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(oe0Var);
            i22++;
            i5Var2 = i5Var;
            animatorSet3 = animatorSet5;
            i20 = 1;
        }
        AnimatorSet animatorSet6 = animatorSet3;
        arrayList2.add(ObjectAnimator.ofFloat(re0Var.v, (Property<ah.v, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ke0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                re0 re0Var2 = me0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i24 = 0;
                while (true) {
                    ArrayList arrayList3 = re0Var2.S;
                    if (i24 >= arrayList3.size()) {
                        return;
                    }
                    oe0 oe0Var2 = (oe0) arrayList3.get(i24);
                    if (oe0Var2.b <= animatedFraction) {
                        oe0Var2.a.start();
                        arrayList3.remove(i24);
                        i24--;
                    }
                    i24++;
                }
            }
        });
        es esVar = es.h;
        animatorSet6.setInterpolator(esVar);
        animatorSet6.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(re0Var.T, 1.0f);
        ofFloat4.addUpdateListener(new f80(this, 3));
        ofFloat4.addListener(new le0(this, i10));
        ofFloat4.setDuration(420L);
        ofFloat4.setInterpolator(esVar);
        arrayList2.add(ofFloat4);
        animatorSet6.playTogether(arrayList2);
        animatorSet6.addListener(new le0(this, 1));
        animatorSet6.start();
        AnimatorSet animatorSet7 = new AnimatorSet();
        re0Var.N = animatorSet7;
        animatorSet7.setDuration(332L);
        if (AndroidUtilities.isTablet() || re0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet7.playTogether(ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), re0Var.H), ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet7.setInterpolator(es.g);
        animatorSet7.start();
    }
}
