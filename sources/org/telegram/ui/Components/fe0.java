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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fe0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ le0 d;

    public fe0(le0 le0Var, int i10, int i11, Runnable runnable) {
        this.d = le0Var;
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
        le0 le0Var = this.d;
        di.i4 i4Var2 = le0Var.e;
        ArrayList arrayList = le0Var.W;
        int[] iArr2 = le0Var.h0;
        ak0 ak0Var = le0Var.M;
        le0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (le0Var.P || !le0Var.isAttachedToWindow()) {
            return;
        }
        le0Var.setAlpha(1.0f);
        int i10 = 0;
        ak0Var.getAnimatedDrawable().N(0, false, false);
        ak0Var.getAnimatedDrawable().P(37);
        ak0Var.d();
        le0Var.o(true);
        AndroidUtilities.runOnUIThread(new wa0(this, 6), 350L);
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
            he0 he0Var = new he0();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[i20]);
            he0Var.b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - AndroidUtilities.dp(40.0f);
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
            he0Var.a = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, i22 == -1 ? 0.9f : 0.6f, i22 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            he0Var.a.addListener(new i10(animatorSet, 9));
            he0Var.a.setDuration(i22 == -1 ? 232L : 200L);
            he0Var.a.setInterpolator(new DecelerateInterpolator());
            arrayList.add(he0Var);
            i22++;
            i4Var2 = i4Var;
            iArr2 = iArr;
            max = d;
            i20 = 1;
        }
        final double d10 = max;
        arrayList2.add(ObjectAnimator.ofFloat(le0Var.v, (Property<bh.p, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList2.add(ofFloat);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.de0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                le0 le0Var2 = fe0.this.d;
                double animatedFraction = d10 * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList3 = le0Var2.W;
                    if (i23 >= arrayList3.size()) {
                        return;
                    }
                    he0 he0Var2 = (he0) arrayList3.get(i23);
                    if (he0Var2.b <= animatedFraction) {
                        he0Var2.a.start();
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
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(le0Var.a0, 1.0f);
        ofFloat2.addUpdateListener(new e80(this, 3));
        ofFloat2.addListener(new ee0(this, i10));
        ofFloat2.setDuration(420L);
        ofFloat2.setInterpolator(dsVar);
        arrayList2.add(ofFloat2);
        animatorSet2.playTogether(arrayList2);
        animatorSet2.addListener(new ee0(this, 1));
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
        animatorSet4.playTogether(ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), le0Var.L), ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ak0Var, (Property<ak0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(ds.g);
        animatorSet4.start();
    }
}
