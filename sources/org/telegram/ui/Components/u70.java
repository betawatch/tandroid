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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class u70 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public v30 c;
    public boolean d;
    public final /* synthetic */ v70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(v70 v70Var, Context context) {
        super(context);
        this.e = v70Var;
        this.b = new ArrayList();
    }

    public final void a(v30 v30Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        v70 v70Var = this.e;
        v70Var.f0.k(v30Var, v30Var.getUid());
        AnimatorSet animatorSet = v70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v70Var.d0.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            v70Var.d0 = animatorSet2;
            animatorSet2.addListener(new t70(this, i10));
            v70Var.d0.setDuration(150L);
            v70Var.d0.setInterpolator(bs.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(v30Var);
    }

    public final void b(v30 v30Var) {
        this.d = false;
        v70 v70Var = this.e;
        v70Var.f0.l(v30Var.getUid());
        v30Var.setOnClickListener(null);
        AnimatorSet animatorSet = v70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v70Var.d0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v70Var.d0 = animatorSet2;
        animatorSet2.addListener(new ai.me(28, this, v30Var));
        v70Var.d0.setDuration(150L);
        this.c = v30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<v30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<v30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<v30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        org.telegram.ui.ActionBar.v1 v1Var;
        int i12;
        v70 v70Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = v70Var.V;
        ai.u1 u1Var = v70Var.d;
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
            if (childAt instanceof v30) {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.g0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.g0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    v30 v30Var = this.c;
                    if (childAt == v30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (v30Var != null) {
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
                    i14 = org.telegram.messenger.g0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.g0.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                v1Var = v1Var2;
            }
            i13++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = v70Var.m0 != null ? v70Var.g0 ? Math.min(v70Var.s0, dp6) : 0 : org.telegram.messenger.g0.b(52.0f, Math.min(v70Var.s0, dp6), 0);
        int i16 = v70Var.u0;
        int dp7 = (v70Var.m0 != null || v70Var.f0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        v70Var.u0 = dp7;
        if (min != v70Var.o0 || i16 != dp7) {
            v70Var.o0 = min;
            if (u1Var.getAdapter() != null && u1Var.getAdapter().h() > 0 && (K = u1Var.K(0)) != null) {
                u1Var.getAdapter().m(0);
                v70Var.R.h1(0, K.a.getTop() - u1Var.getPaddingTop());
                if (u1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ci.u4(this, 8));
                    ofFloat.setDuration(u1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(v70Var.s0, dp6);
        int i17 = v70Var.k0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new l6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > v70Var.s0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.s70
                public final /* synthetic */ u70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            v70 v70Var2 = this.b.e;
                            v70Var2.V.smoothScrollTo(0, dp6 - v70Var2.s0);
                            break;
                        default:
                            v70 v70Var3 = this.b.e;
                            v70Var3.V.smoothScrollTo(0, dp6 - v70Var3.s0);
                            break;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.s70
                public final /* synthetic */ u70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            v70 v70Var2 = this.b.e;
                            v70Var2.V.smoothScrollTo(0, dp6 - v70Var2.s0);
                            break;
                        default:
                            v70 v70Var3 = this.b.e;
                            v70Var3.V.smoothScrollTo(0, dp6 - v70Var3.s0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = v70Var.d0) != null) {
            animatorSet.playTogether(arrayList);
            v70Var.d0.addListener(new t70(this, 0));
            v70Var.d0.start();
            this.a = true;
        }
        if (v70Var.d0 == null) {
            v70Var.k0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.f3) v70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        u1Var.setTranslationY(0.0f);
    }
}
