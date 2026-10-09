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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oe0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ te0 d;

    public oe0(te0 te0Var, int i10, int i11, Runnable runnable) {
        this.d = te0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        ai.x5 x5Var;
        fk0 fk0Var;
        AnimatorSet animatorSet;
        te0 te0Var = this.d;
        ai.x5 x5Var2 = te0Var.e;
        ArrayList arrayList = te0Var.S;
        int[] iArr = te0Var.d0;
        fk0 fk0Var2 = te0Var.I;
        te0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (te0Var.L || !te0Var.isAttachedToWindow()) {
            return;
        }
        te0Var.setAlpha(1.0f);
        int i10 = 0;
        fk0Var2.getAnimatedDrawable().N(0, false, false);
        fk0Var2.getAnimatedDrawable().P(37);
        fk0Var2.d();
        te0Var.n(true);
        AndroidUtilities.runOnUIThread(new bd0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        te0Var.M = animatorSet2;
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
        fk0 fk0Var3 = fk0Var2;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i21)), Math.sqrt(i21 + i15));
        arrayList.clear();
        int childCount = x5Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = x5Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            qe0 qe0Var = new qe0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr[i20]);
            int i23 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            qe0Var.b = ((float) Math.sqrt(i23)) - AndroidUtilities.dp(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                x5Var = x5Var2;
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
                fk0Var = fk0Var3;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                x5Var = x5Var2;
                fk0Var = fk0Var3;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            qe0Var.a = animatorSet3;
            fk0 fk0Var4 = fk0Var;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i22 != -1 ? 0.6f : 0.9f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            qe0Var.a.addListener(new vd0(animatorSet, 2));
            qe0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            qe0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(qe0Var);
            i22++;
            arrayList2 = arrayList3;
            x5Var2 = x5Var;
            fk0Var3 = fk0Var4;
            i20 = 1;
        }
        ArrayList arrayList4 = arrayList2;
        fk0 fk0Var5 = fk0Var3;
        arrayList4.add(ObjectAnimator.ofFloat(te0Var.v, (Property<ci.m6, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList4.add(ofFloat3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.me0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                te0 te0Var2 = oe0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i25 = 0;
                while (true) {
                    ArrayList arrayList5 = te0Var2.S;
                    if (i25 >= arrayList5.size()) {
                        return;
                    }
                    qe0 qe0Var2 = (qe0) arrayList5.get(i25);
                    if (qe0Var2.b <= animatedFraction) {
                        qe0Var2.a.start();
                        arrayList5.remove(i25);
                        i25--;
                    }
                    i25++;
                }
            }
        });
        hs hsVar = hs.h;
        animatorSet2.setInterpolator(hsVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(te0Var.T, 1.0f);
        ofFloat4.addUpdateListener(new j80(this, 3));
        ofFloat4.addListener(new ne0(this, i10));
        ofFloat4.setDuration(420L);
        ofFloat4.setInterpolator(hsVar);
        arrayList4.add(ofFloat4);
        animatorSet2.playTogether(arrayList4);
        animatorSet2.addListener(new ne0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        te0Var.N = animatorSet4;
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || te0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(fk0Var5, (Property<fk0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(fk0Var5, (Property<fk0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), te0Var.H), ObjectAnimator.ofFloat(fk0Var5, (Property<fk0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(fk0Var5, (Property<fk0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(hs.g);
        animatorSet4.start();
    }
}
