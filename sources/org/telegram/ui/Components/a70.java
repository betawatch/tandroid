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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a70 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public m30 c;
    public boolean d;
    public final /* synthetic */ b70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(b70 b70Var, Context context) {
        super(context);
        this.e = b70Var;
        this.b = new ArrayList();
    }

    public final void a(m30 m30Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        b70 b70Var = this.e;
        b70Var.f0.k(m30Var, m30Var.getUid());
        AnimatorSet animatorSet = b70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            b70Var.d0.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b70Var.d0 = animatorSet2;
            animatorSet2.addListener(new z60(this, i10));
            b70Var.d0.setDuration(150L);
            b70Var.d0.setInterpolator(pr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(m30Var);
    }

    public final void b(m30 m30Var) {
        this.d = false;
        b70 b70Var = this.e;
        b70Var.f0.l(m30Var.getUid());
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = b70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            b70Var.d0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        b70Var.d0 = animatorSet2;
        animatorSet2.addListener(new bi.t(27, this, m30Var));
        b70Var.d0.setDuration(150L);
        this.c = m30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<m30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<m30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<m30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i12;
        b70 b70Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = b70Var.V;
        bi.o0 o0Var = b70Var.d;
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
            if (childAt instanceof m30) {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    m30 m30Var = this.c;
                    if (childAt == m30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (m30Var != null) {
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
                    i14 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                v1Var = v1Var2;
            }
            i13++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = b70Var.m0 != null ? b70Var.g0 ? Math.min(b70Var.s0, dp6) : 0 : i2.g.f(52.0f, Math.min(b70Var.s0, dp6), 0);
        int i16 = b70Var.u0;
        int dp7 = (b70Var.m0 != null || b70Var.f0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        b70Var.u0 = dp7;
        if (min != b70Var.o0 || i16 != dp7) {
            b70Var.o0 = min;
            if (o0Var.getAdapter() != null && o0Var.getAdapter().h() > 0 && (K = o0Var.K(0)) != null) {
                o0Var.getAdapter().m(0);
                b70Var.R.h1(0, K.a.getTop() - o0Var.getPaddingTop());
                if (o0Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bi.u5(this, 8));
                    ofFloat.setDuration(o0Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(b70Var.s0, dp6);
        int i17 = b70Var.k0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new l6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > b70Var.s0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.y60
                public final /* synthetic */ a70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            b70 b70Var2 = this.b.e;
                            b70Var2.V.smoothScrollTo(0, dp6 - b70Var2.s0);
                            break;
                        default:
                            b70 b70Var3 = this.b.e;
                            b70Var3.V.smoothScrollTo(0, dp6 - b70Var3.s0);
                            break;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.y60
                public final /* synthetic */ a70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            b70 b70Var2 = this.b.e;
                            b70Var2.V.smoothScrollTo(0, dp6 - b70Var2.s0);
                            break;
                        default:
                            b70 b70Var3 = this.b.e;
                            b70Var3.V.smoothScrollTo(0, dp6 - b70Var3.s0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = b70Var.d0) != null) {
            animatorSet.playTogether(arrayList);
            b70Var.d0.addListener(new z60(this, 0));
            b70Var.d0.start();
            this.a = true;
        }
        if (b70Var.d0 == null) {
            b70Var.k0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.f3) b70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        o0Var.setTranslationY(0.0f);
    }
}
