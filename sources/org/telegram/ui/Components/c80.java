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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c80 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public d40 c;
    public boolean d;
    public final /* synthetic */ d80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(d80 d80Var, Context context) {
        super(context);
        this.e = d80Var;
        this.b = new ArrayList();
    }

    public final void a(d40 d40Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        d80 d80Var = this.e;
        d80Var.f0.k(d40Var, d40Var.getUid());
        AnimatorSet animatorSet = d80Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            d80Var.d0.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            d80Var.d0 = animatorSet2;
            animatorSet2.addListener(new b80(this, i10));
            d80Var.d0.setDuration(150L);
            d80Var.d0.setInterpolator(hs.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(d40Var);
    }

    public final void b(d40 d40Var) {
        this.d = false;
        d80 d80Var = this.e;
        d80Var.f0.l(d40Var.getUid());
        d40Var.setOnClickListener(null);
        AnimatorSet animatorSet = d80Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            d80Var.d0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        d80Var.d0 = animatorSet2;
        animatorSet2.addListener(new ai.z(27, this, d40Var));
        d80Var.d0.setDuration(150L);
        this.c = d40Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<d40, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<d40, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<d40, Float>) View.ALPHA, 1.0f, 0.0f));
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
        s4.d1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i12;
        d80 d80Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = d80Var.V;
        ai.w0 w0Var = d80Var.d;
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
            if (childAt instanceof d40) {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    d40 d40Var = this.c;
                    if (childAt == d40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (d40Var != null) {
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
                    i14 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                v1Var = v1Var2;
            }
            i13++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = d80Var.m0 != null ? d80Var.g0 ? Math.min(d80Var.s0, dp6) : 0 : org.telegram.messenger.q.b(52.0f, Math.min(d80Var.s0, dp6), 0);
        int i16 = d80Var.u0;
        int dp7 = (d80Var.m0 != null || d80Var.f0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        d80Var.u0 = dp7;
        if (min != d80Var.o0 || i16 != dp7) {
            d80Var.o0 = min;
            if (w0Var.getAdapter() != null && w0Var.getAdapter().h() > 0 && (K = w0Var.K(0)) != null) {
                w0Var.getAdapter().m(0);
                d80Var.R.h1(0, K.a.getTop() - w0Var.getPaddingTop());
                if (w0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.l6(this, 8));
                    ofFloat.setDuration(w0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(d80Var.s0, dp6);
        int i17 = d80Var.k0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new m6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > d80Var.s0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.a80
                public final /* synthetic */ c80 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            d80 d80Var2 = this.b.e;
                            d80Var2.V.smoothScrollTo(0, dp6 - d80Var2.s0);
                            break;
                        default:
                            d80 d80Var3 = this.b.e;
                            d80Var3.V.smoothScrollTo(0, dp6 - d80Var3.s0);
                            break;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.a80
                public final /* synthetic */ c80 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            d80 d80Var2 = this.b.e;
                            d80Var2.V.smoothScrollTo(0, dp6 - d80Var2.s0);
                            break;
                        default:
                            d80 d80Var3 = this.b.e;
                            d80Var3.V.smoothScrollTo(0, dp6 - d80Var3.s0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = d80Var.d0) != null) {
            animatorSet.playTogether(arrayList);
            d80Var.d0.addListener(new b80(this, 0));
            d80Var.d0.start();
            this.a = true;
        }
        if (d80Var.d0 == null) {
            d80Var.k0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.f3) d80Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        w0Var.setTranslationY(0.0f);
    }
}
