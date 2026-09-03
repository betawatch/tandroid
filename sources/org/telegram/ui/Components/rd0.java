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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ xd0 d;

    public rd0(xd0 xd0Var, int i10, int i11, Runnable runnable) {
        this.d = xd0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f10;
        int dp;
        int[] iArr;
        ud0 ud0Var;
        int i10;
        AnimatorSet animatorSet;
        xd0 xd0Var = this.d;
        int[] iArr2 = xd0Var.T;
        xd0Var.setAlpha(1.0f);
        xd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        kj0 kj0Var = xd0Var.F;
        kj0Var.getAnimatedDrawable().L(0, false, false);
        kj0Var.getAnimatedDrawable().N(37);
        kj0Var.d();
        xd0Var.m(true);
        AndroidUtilities.runOnUIThread(new ec0(this, 4), 350L);
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
        ArrayList arrayList2 = xd0Var.L;
        arrayList2.clear();
        eh.d dVar = xd0Var.e;
        int childCount = dVar.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = dVar.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ud0 ud0Var2 = new ud0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[c3]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[1]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            int i23 = i11;
            ud0Var2.b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
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
                ud0Var = ud0Var2;
                animatorSet.playTogether(animatorArr);
                i10 = i16;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                ud0Var = ud0Var2;
                i10 = i16;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ud0Var.a = animatorSet3;
            Property property3 = View.SCALE_X;
            float f11 = i21 == -1 ? 0.9f : 0.6f;
            float f12 = i21 == -1 ? 1.0f : 1.04f;
            eh.d dVar2 = dVar;
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
            ud0Var.a.addListener(new pd0(animatorSet, 0));
            ud0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            ud0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList2.add(ud0Var);
            i21++;
            i16 = i10;
            iArr2 = iArr;
            i11 = i23;
            dVar = dVar2;
            c3 = 0;
        }
        int i24 = i11;
        int i25 = i16;
        arrayList.add(ObjectAnimator.ofFloat(xd0Var.v, (Property<ag.l, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat6);
        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.od0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                xd0 xd0Var2 = rd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i26 = 0;
                while (true) {
                    ArrayList arrayList3 = xd0Var2.L;
                    if (i26 >= arrayList3.size()) {
                        return;
                    }
                    ud0 ud0Var3 = (ud0) arrayList3.get(i26);
                    if (ud0Var3.b <= animatedFraction) {
                        ud0Var3.a.start();
                        arrayList3.remove(i26);
                        i26--;
                    }
                    i26++;
                }
            }
        });
        pr prVar = pr.h;
        animatorSet2.setInterpolator(prVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(xd0Var.M, 1.0f);
        ofFloat7.addUpdateListener(new k70(this, 2));
        ofFloat7.addListener(new qd0(this, 0));
        ofFloat7.setDuration(420L);
        ofFloat7.setInterpolator(prVar);
        arrayList.add(ofFloat7);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new qd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || xd0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i24 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f10 = (SharedConfig.passcodeType == 0 ? i24 / 2.0f : i24) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f10 - dp), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.TRANSLATION_Y, i25 - AndroidUtilities.dp(29.0f), xd0Var.E), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(kj0Var, (Property<kj0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(pr.g);
        animatorSet4.start();
    }
}
