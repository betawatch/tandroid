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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ge0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ me0 d;

    public ge0(me0 me0Var, int i10, int i11, Runnable runnable) {
        this.d = me0Var;
        this.a = i10;
        this.b = i11;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f7;
        int dp;
        di.i4 i4Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        me0 me0Var = this.d;
        di.i4 i4Var2 = me0Var.e;
        ArrayList arrayList = me0Var.W;
        int[] iArr2 = me0Var.h0;
        bk0 bk0Var = me0Var.M;
        me0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (me0Var.P || !me0Var.isAttachedToWindow()) {
            return;
        }
        me0Var.setAlpha(1.0f);
        int i10 = 0;
        bk0Var.getAnimatedDrawable().N(0, false, false);
        bk0Var.getAnimatedDrawable().P(37);
        bk0Var.d();
        me0Var.o(true);
        AndroidUtilities.runOnUIThread(new xa0(this, 6), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        me0Var.Q = animatorSet2;
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
        int i19 = i13 * i13;
        int i20 = 1;
        int i21 = i16 * i16;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i18 + i15), Math.sqrt(i18 + i19)), Math.sqrt(i19 + i21)), Math.sqrt(i21 + i15));
        arrayList.clear();
        int childCount = i4Var2.getChildCount();
        int i22 = 0;
        while (i22 < childCount) {
            View childAt = i4Var2.getChildAt(i22);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ie0 ie0Var = new ie0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[i20]);
            ie0Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - AndroidUtilities.dp(40.0f);
            if (i22 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                i4Var = i4Var2;
                float[] fArr = new float[i20];
                fArr[0] = 1.0f;
                view = childAt;
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                d = max;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                i4Var = i4Var2;
                iArr = iArr2;
                d = max;
                view = childAt;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ie0Var.a = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            ie0Var.a.addListener(new i10(animatorSet, 9));
            ie0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            ie0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(ie0Var);
            i22++;
            i4Var2 = i4Var;
            iArr2 = iArr;
            max = d;
            i20 = 1;
        }
        final double d10 = max;
        arrayList2.add(ObjectAnimator.ofFloat(me0Var.v, (Property<bh.p, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ee0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                me0 me0Var2 = ge0.this.d;
                double animatedFraction = d10 * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList3 = me0Var2.W;
                    if (i23 >= arrayList3.size()) {
                        return;
                    }
                    ie0 ie0Var2 = (ie0) arrayList3.get(i23);
                    if (ie0Var2.b <= animatedFraction) {
                        ie0Var2.a.start();
                        arrayList3.remove(i23);
                        i23--;
                    }
                    i23++;
                }
            }
        });
        ds dsVar = ds.h;
        animatorSet2.setInterpolator(dsVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(me0Var.a0, 1.0f);
        ofFloat2.addUpdateListener(new f80(this, 3));
        ofFloat2.addListener(new fe0(this, i10));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(dsVar);
        arrayList2.add(ofFloat2);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new fe0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        me0Var.R = animatorSet4;
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || me0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        } else {
            f7 = (SharedConfig.passcodeType == 0 ? i11 / 2.0f : i11) / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), me0Var.L), ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(bk0Var, (Property<bk0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(ds.g);
        animatorSet4.start();
    }
}
