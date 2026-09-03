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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ wd0 d;

    public qd0(wd0 wd0Var, int i10, int i11, Runnable runnable) {
        this.d = wd0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f10;
        int dp;
        int[] iArr;
        td0 td0Var;
        int i10;
        AnimatorSet animatorSet;
        wd0 wd0Var = this.d;
        int[] iArr2 = wd0Var.T;
        wd0Var.setAlpha(1.0f);
        wd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        jj0 jj0Var = wd0Var.F;
        jj0Var.getAnimatedDrawable().L(0, false, false);
        jj0Var.getAnimatedDrawable().N(37);
        jj0Var.d();
        wd0Var.m(true);
        AndroidUtilities.runOnUIThread(new dc0(this, 4), 350L);
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
        char c3 = 0;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i20)), Math.sqrt(i20 + i15));
        ArrayList arrayList2 = wd0Var.L;
        arrayList2.clear();
        dh.d dVar = wd0Var.e;
        int childCount = dVar.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = dVar.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            td0 td0Var2 = new td0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[c3]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[1]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            int i23 = i11;
            td0Var2.b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                iArr = iArr2;
                float[] fArr = new float[1];
                fArr[c3] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr);
                Property property2 = View.SCALE_Y;
                float[] fArr2 = new float[1];
                fArr2[c3] = 1.0f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2);
                Animator[] animatorArr = new Animator[2];
                animatorArr[c3] = ofFloat;
                animatorArr[1] = ofFloat2;
                td0Var = td0Var2;
                animatorSet.playTogether(animatorArr);
                i10 = i16;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                td0Var = td0Var2;
                i10 = i16;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            td0Var.a = animatorSet3;
            Property property3 = View.SCALE_X;
            float f11 = i21 == -1 ? 0.9f : 0.6f;
            float f12 = i21 == -1 ? 1.0f : 1.04f;
            dh.d dVar2 = dVar;
            float[] fArr3 = new float[2];
            fArr3[c3] = f11;
            fArr3[1] = f12;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property3, fArr3);
            Property property4 = View.SCALE_Y;
            float f13 = i21 != -1 ? 0.6f : 0.9f;
            float f14 = i21 == -1 ? 1.0f : 1.04f;
            float[] fArr4 = new float[2];
            fArr4[c3] = f13;
            fArr4[1] = f14;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property4, fArr4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            Animator[] animatorArr2 = new Animator[3];
            animatorArr2[c3] = ofFloat3;
            animatorArr2[1] = ofFloat4;
            animatorArr2[2] = ofFloat5;
            animatorSet3.playTogether(animatorArr2);
            td0Var.a.addListener(new od0(animatorSet, 0));
            td0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            td0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList2.add(td0Var);
            i21++;
            i16 = i10;
            iArr2 = iArr;
            i11 = i23;
            dVar = dVar2;
            c3 = 0;
        }
        int i24 = i11;
        int i25 = i16;
        arrayList.add(ObjectAnimator.ofFloat(wd0Var.v, (Property<ah.e, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat6);
        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.nd0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                wd0 wd0Var2 = qd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i26 = 0;
                while (true) {
                    ArrayList arrayList3 = wd0Var2.L;
                    if (i26 >= arrayList3.size()) {
                        return;
                    }
                    td0 td0Var3 = (td0) arrayList3.get(i26);
                    if (td0Var3.b <= animatedFraction) {
                        td0Var3.a.start();
                        arrayList3.remove(i26);
                        i26--;
                    }
                    i26++;
                }
            }
        });
        mr mrVar = mr.h;
        animatorSet2.setInterpolator(mrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(wd0Var.M, 1.0f);
        ofFloat7.addUpdateListener(new j70(this, 2));
        ofFloat7.addListener(new pd0(this, 0));
        ofFloat7.setDuration(420L);
        ofFloat7.setInterpolator(mrVar);
        arrayList.add(ofFloat7);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new pd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || wd0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i24 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f10 = (SharedConfig.passcodeType == 0 ? i24 / 2.0f : i24) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f10 - dp), ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) View.TRANSLATION_Y, i25 - AndroidUtilities.dp(29.0f), wd0Var.E), ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(jj0Var, (Property<jj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(mr.g);
        animatorSet4.start();
    }
}
