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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z50 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public f20 c;
    public boolean d;
    public final /* synthetic */ a60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a60 a60Var, Context context) {
        super(context);
        this.e = a60Var;
        this.b = new ArrayList();
    }

    public final void a(f20 f20Var, boolean z10) {
        int i7 = 1;
        this.d = true;
        a60 a60Var = this.e;
        a60Var.a2.k(f20Var, f20Var.getUid());
        AnimatorSet animatorSet = a60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a60Var.Y1.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            a60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new x50(this, i7));
            a60Var.Y1.setDuration(150L);
            a60Var.Y1.setInterpolator(er.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(f20Var);
    }

    public final void b(f20 f20Var) {
        int i7 = 0;
        this.d = false;
        a60 a60Var = this.e;
        a60Var.a2.l(f20Var.getUid());
        f20Var.setOnClickListener(null);
        AnimatorSet animatorSet = a60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a60Var.Y1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new y50(i7, this, f20Var));
        a60Var.Y1.setDuration(150L);
        this.c = f20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<f20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<f20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<f20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        v4.e1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l1 l1Var;
        int i11;
        a60 a60Var = this.e;
        org.telegram.ui.ActionBar.l1 l1Var2 = a60Var.Q1;
        di.c1 c1Var = a60Var.o1;
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
            if (childAt instanceof f20) {
                l1Var = l1Var2;
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
                    f20 f20Var = this.c;
                    if (childAt == f20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (f20Var != null) {
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
                l1Var = l1Var2;
            }
            i12++;
            l1Var2 = l1Var;
        }
        org.telegram.ui.ActionBar.l1 l1Var3 = l1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        int min = a60Var.h2 != null ? a60Var.b2 ? Math.min(a60Var.n2, L6) : 0 : i5.c.d(52.0f, Math.min(a60Var.n2, L6), 0);
        int i15 = a60Var.p2;
        int L7 = (a60Var.h2 != null || a60Var.a2.m() <= 0) ? 0 : org.telegram.messenger.g0.L(56.0f);
        a60Var.p2 = L7;
        if (min != a60Var.j2 || i15 != L7) {
            a60Var.j2 = min;
            if (c1Var.getAdapter() != null && c1Var.getAdapter().b() > 0 && (K = c1Var.K(0)) != null) {
                c1Var.getAdapter().g(0);
                a60Var.M1.h1(0, K.a.getTop() - c1Var.getPaddingTop());
                if (c1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.f4(this, 9));
                    ofFloat.setDuration(c1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(a60Var.n2, L6);
        int i16 = a60Var.f2;
        if (i16 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i16, min2);
            ofInt.addUpdateListener(new c6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && L6 > a60Var.n2) {
            final int i17 = 0;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.w50
                public final /* synthetic */ z50 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            a60 a60Var2 = this.b.e;
                            a60Var2.Q1.smoothScrollTo(0, L6 - a60Var2.n2);
                            break;
                        default:
                            a60 a60Var3 = this.b.e;
                            a60Var3.Q1.smoothScrollTo(0, L6 - a60Var3.n2);
                            break;
                    }
                }
            });
        } else if (!z10 && l1Var3.getMeasuredHeight() + l1Var3.getScrollY() > L6) {
            final int i18 = 1;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.w50
                public final /* synthetic */ z50 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            a60 a60Var2 = this.b.e;
                            a60Var2.Q1.smoothScrollTo(0, L6 - a60Var2.n2);
                            break;
                        default:
                            a60 a60Var3 = this.b.e;
                            a60Var3.Q1.smoothScrollTo(0, L6 - a60Var3.n2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = a60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            a60Var.Y1.addListener(new x50(this, 0));
            a60Var.Y1.start();
            this.a = true;
        }
        if (a60Var.Y1 == null) {
            a60Var.f2 = min2;
            a60Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        c1Var.setTranslationY(0.0f);
    }
}
