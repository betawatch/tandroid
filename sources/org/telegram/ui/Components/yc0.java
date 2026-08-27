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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ dd0 d;

    public yc0(dd0 dd0Var, int i10, int i11, Runnable runnable) {
        this.d = dd0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f10;
        int dp;
        int[] iArr;
        ag.d dVar;
        int i10;
        AnimatorSet animatorSet;
        dd0 dd0Var = this.d;
        int[] iArr2 = dd0Var.S;
        dd0Var.setAlpha(1.0f);
        dd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ri0 ri0Var = dd0Var.E;
        ri0Var.getAnimatedDrawable().L(0, false, false);
        ri0Var.getAnimatedDrawable().N(37);
        ri0Var.d();
        char c10 = 1;
        dd0Var.m(true);
        AndroidUtilities.runOnUIThread(new mb0(this, 4), 350L);
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
        ArrayList arrayList2 = dd0Var.K;
        arrayList2.clear();
        ag.d dVar2 = dd0Var.e;
        int childCount = dVar2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = dVar2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ad0 ad0Var = new ad0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            ad0Var.b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
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
            ad0Var.a = animatorSet3;
            ag.d dVar3 = dVar;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i21 == -1 ? 0.9f : 0.6f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i21 != -1 ? 0.6f : 0.9f, i21 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            ad0Var.a.addListener(new sz(animatorSet, 9));
            ad0Var.a.setDuration(i21 == -1 ? 232L : 200L);
            ad0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(ad0Var);
            i21++;
            arrayList2 = arrayList3;
            childCount = i10;
            iArr2 = iArr;
            dVar2 = dVar3;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(dd0Var.v, (Property<ag.y1, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.wc0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dd0 dd0Var2 = yc0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList4 = dd0Var2.K;
                    if (i23 >= arrayList4.size()) {
                        return;
                    }
                    ad0 ad0Var2 = (ad0) arrayList4.get(i23);
                    if (ad0Var2.b <= animatedFraction) {
                        ad0Var2.a.start();
                        arrayList4.remove(i23);
                        i23--;
                    }
                    i23++;
                }
            }
        });
        er erVar = er.h;
        animatorSet2.setInterpolator(erVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dd0Var.L, 1.0f);
        ofFloat2.addUpdateListener(new v60(this, 2));
        ofFloat2.addListener(new xc0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(erVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new xc0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || dd0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f10 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f10 - dp), ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), dd0Var.D), ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(er.g);
        animatorSet4.start();
    }
}
