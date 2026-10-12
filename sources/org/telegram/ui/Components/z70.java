package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z70 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public z30 c;
    public boolean d;
    public final /* synthetic */ a80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(a80 a80Var, Context context) {
        super(context);
        this.e = a80Var;
        this.b = new ArrayList();
    }

    public final void a(z30 z30Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        a80 a80Var = this.e;
        a80Var.f0.k(z30Var, z30Var.getUid());
        AnimatorSet animatorSet = a80Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a80Var.d0.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            a80Var.d0 = animatorSet2;
            animatorSet2.addListener(new y70(this, i10));
            a80Var.d0.setDuration(150L);
            a80Var.d0.setInterpolator(es.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(z30Var);
    }

    public final void b(z30 z30Var) {
        this.d = false;
        a80 a80Var = this.e;
        a80Var.f0.l(z30Var.getUid());
        z30Var.setOnClickListener(null);
        AnimatorSet animatorSet = a80Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a80Var.d0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a80Var.d0 = animatorSet2;
        animatorSet2.addListener(new bi.t(27, this, z30Var));
        a80Var.d0.setDuration(150L);
        this.c = z30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<z30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<z30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<z30, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        s4.b1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i12;
        a80 a80Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = a80Var.V;
        bi.o0 o0Var = a80Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof z30) {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.yh.c(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.yh.c(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    z30 z30Var = this.c;
                    if (childAt == z30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (z30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.c) {
                    i14 = org.telegram.messenger.yh.c(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.yh.c(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                u1Var = u1Var2;
            }
            i13++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = a80Var.m0 != null ? a80Var.g0 ? Math.min(a80Var.s0, dp6) : 0 : org.telegram.messenger.q.c(52.0f, Math.min(a80Var.s0, dp6), 0);
        int i16 = a80Var.u0;
        int dp7 = (a80Var.m0 != null || a80Var.f0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        a80Var.u0 = dp7;
        if (min != a80Var.o0 || i16 != dp7) {
            a80Var.o0 = min;
            if (o0Var.getAdapter() != null && o0Var.getAdapter().h() > 0 && (K = o0Var.K(0)) != null) {
                o0Var.getAdapter().m(0);
                a80Var.R.h1(0, K.a.getTop() - o0Var.getPaddingTop());
                if (o0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bi.w5(this, 8));
                    ofFloat.setDuration(o0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(a80Var.s0, dp6);
        int i17 = a80Var.k0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new n6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > a80Var.s0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.x70
                public final /* synthetic */ z70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            a80 a80Var2 = this.b.e;
                            a80Var2.V.smoothScrollTo(0, dp6 - a80Var2.s0);
                            break;
                        default:
                            a80 a80Var3 = this.b.e;
                            a80Var3.V.smoothScrollTo(0, dp6 - a80Var3.s0);
                            break;
                    }
                }
            });
        } else if (!z10 && u1Var3.getMeasuredHeight() + u1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.x70
                public final /* synthetic */ z70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            a80 a80Var2 = this.b.e;
                            a80Var2.V.smoothScrollTo(0, dp6 - a80Var2.s0);
                            break;
                        default:
                            a80 a80Var3 = this.b.e;
                            a80Var3.V.smoothScrollTo(0, dp6 - a80Var3.s0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = a80Var.d0) != null) {
            animatorSet.playTogether(arrayList);
            a80Var.d0.addListener(new y70(this, 0));
            a80Var.d0.start();
            this.a = true;
        }
        if (a80Var.d0 == null) {
            a80Var.k0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.e3) a80Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        o0Var.setTranslationY(0.0f);
    }
}
