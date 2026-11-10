package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w50 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public c20 c;
    public boolean d;
    public final /* synthetic */ x50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(x50 x50Var, Context context) {
        super(context);
        this.e = x50Var;
        this.b = new ArrayList();
    }

    public final void a(c20 c20Var, boolean z9) {
        int i7 = 1;
        this.d = true;
        x50 x50Var = this.e;
        x50Var.Z1.k(c20Var, c20Var.getUid());
        AnimatorSet animatorSet = x50Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x50Var.X1.cancel();
        }
        this.a = false;
        if (z9) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            x50Var.X1 = animatorSet2;
            animatorSet2.addListener(new u50(this, i7));
            x50Var.X1.setDuration(150L);
            x50Var.X1.setInterpolator(wq.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(c20Var, (Property<c20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, (Property<c20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(c20Var, (Property<c20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(c20Var);
    }

    public final void b(c20 c20Var) {
        int i7 = 0;
        this.d = false;
        x50 x50Var = this.e;
        x50Var.Z1.l(c20Var.getUid());
        c20Var.setOnClickListener(null);
        AnimatorSet animatorSet = x50Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x50Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        x50Var.X1 = animatorSet2;
        animatorSet2.addListener(new v50(i7, this, c20Var));
        x50Var.X1.setDuration(150L);
        this.c = c20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<c20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<c20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<c20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        v4.d1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.m1 m1Var;
        int i11;
        x50 x50Var = this.e;
        org.telegram.ui.ActionBar.m1 m1Var2 = x50Var.P1;
        bi.q1 q1Var = x50Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.b;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof c20) {
                m1Var = m1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i13 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i14 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i13;
                if (!this.a) {
                    c20 c20Var = this.c;
                    if (childAt == c20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (c20Var != null) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.c) {
                    i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
            } else {
                m1Var = m1Var2;
            }
            i12++;
            m1Var2 = m1Var;
        }
        org.telegram.ui.ActionBar.m1 m1Var3 = m1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        int min = x50Var.g2 != null ? x50Var.a2 ? Math.min(x50Var.m2, L6) : 0 : jg.g.e(52.0f, Math.min(x50Var.m2, L6), 0);
        int i15 = x50Var.o2;
        int L7 = (x50Var.g2 != null || x50Var.Z1.m() <= 0) ? 0 : org.telegram.messenger.g0.L(56.0f);
        x50Var.o2 = L7;
        if (min != x50Var.i2 || i15 != L7) {
            x50Var.i2 = min;
            if (q1Var.getAdapter() != null && q1Var.getAdapter().b() > 0 && (K = q1Var.K(0)) != null) {
                q1Var.getAdapter().g(0);
                x50Var.L1.h1(0, K.a.getTop() - q1Var.getPaddingTop());
                if (q1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new di.n4(this, 9));
                    ofFloat.setDuration(q1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(x50Var.m2, L6);
        int i16 = x50Var.e2;
        if (i16 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i16, min2);
            ofInt.addUpdateListener(new d6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z9 = this.d;
        if (z9 && L6 > x50Var.m2) {
            final int i17 = 0;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.t50
                public final /* synthetic */ w50 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            x50 x50Var2 = this.b.e;
                            x50Var2.P1.smoothScrollTo(0, L6 - x50Var2.m2);
                            break;
                        default:
                            x50 x50Var3 = this.b.e;
                            x50Var3.P1.smoothScrollTo(0, L6 - x50Var3.m2);
                            break;
                    }
                }
            });
        } else if (!z9 && m1Var3.getMeasuredHeight() + m1Var3.getScrollY() > L6) {
            final int i18 = 1;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.t50
                public final /* synthetic */ w50 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            x50 x50Var2 = this.b.e;
                            x50Var2.P1.smoothScrollTo(0, L6 - x50Var2.m2);
                            break;
                        default:
                            x50 x50Var3 = this.b.e;
                            x50Var3.P1.smoothScrollTo(0, L6 - x50Var3.m2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = x50Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            x50Var.X1.addListener(new u50(this, 0));
            x50Var.X1.start();
            this.a = true;
        }
        if (x50Var.X1 == null) {
            x50Var.e2 = min2;
            x50Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        q1Var.setTranslationY(0.0f);
    }
}
