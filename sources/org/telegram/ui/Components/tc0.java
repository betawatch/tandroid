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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ yc0 d;

    public tc0(yc0 yc0Var, int i9, int i10, Runnable runnable) {
        this.d = yc0Var;
        this.a = i9;
        this.b = i10;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f10;
        int dp;
        int[] iArr;
        dh.g gVar;
        int i9;
        AnimatorSet animatorSet;
        yc0 yc0Var = this.d;
        int[] iArr2 = yc0Var.S;
        yc0Var.setAlpha(1.0f);
        yc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        pi0 pi0Var = yc0Var.E;
        pi0Var.getAnimatedDrawable().L(0, false, false);
        pi0Var.getAnimatedDrawable().N(37);
        pi0Var.d();
        char c10 = 1;
        yc0Var.m(true);
        AndroidUtilities.runOnUIThread(new ib0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x;
        int i11 = point.y + AndroidUtilities.statusBarHeight;
        int i12 = this.a;
        int i13 = i10 - i12;
        int i14 = i13 * i13;
        int i15 = this.b;
        int i16 = i11 - i15;
        int i17 = i16 * i16;
        double sqrt = Math.sqrt(i17 + i14);
        int i18 = i12 * i12;
        double sqrt2 = Math.sqrt(i17 + i18);
        int i19 = i15 * i15;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i18 + i19)), Math.sqrt(i19 + i14));
        ArrayList arrayList2 = yc0Var.K;
        arrayList2.clear();
        dh.g gVar2 = yc0Var.e;
        int childCount = gVar2.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt = gVar2.getChildAt(i20);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            vc0 vc0Var = new vc0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i21 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            vc0Var.b = ((float) Math.sqrt(i21)) - AndroidUtilities.dp(40.0f);
            if (i20 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                gVar = gVar2;
                i9 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                gVar = gVar2;
                i9 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            vc0Var.a = animatorSet3;
            dh.g gVar3 = gVar;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i20 == -1 ? 0.9f : 0.6f, i20 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i20 != -1 ? 0.6f : 0.9f, i20 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            vc0Var.a.addListener(new r60(animatorSet, 7));
            vc0Var.a.setDuration(i20 == -1 ? 232L : 200L);
            vc0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(vc0Var);
            i20++;
            arrayList2 = arrayList3;
            childCount = i9;
            iArr2 = iArr;
            gVar2 = gVar3;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(yc0Var.v, (Property<fh.v, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rc0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                yc0 yc0Var2 = tc0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i22 = 0;
                while (true) {
                    ArrayList arrayList4 = yc0Var2.K;
                    if (i22 >= arrayList4.size()) {
                        return;
                    }
                    vc0 vc0Var2 = (vc0) arrayList4.get(i22);
                    if (vc0Var2.b <= animatedFraction) {
                        vc0Var2.a.start();
                        arrayList4.remove(i22);
                        i22--;
                    }
                    i22++;
                }
            }
        });
        gr grVar = gr.h;
        animatorSet2.setInterpolator(grVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(yc0Var.L, 1.0f);
        ofFloat2.addUpdateListener(new q60(this, 2));
        ofFloat2.addListener(new sc0(this, 0));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(grVar);
        arrayList.add(ofFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new sc0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || yc0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i10 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f10 = (SharedConfig.passcodeType == 0 ? i10 / 2.0f : i10) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) View.TRANSLATION_X, i12 - AndroidUtilities.dp(29.0f), f10 - dp), ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) View.TRANSLATION_Y, i15 - AndroidUtilities.dp(29.0f), yc0Var.D), ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(pi0Var, (Property<pi0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(gr.g);
        animatorSet4.start();
    }
}
