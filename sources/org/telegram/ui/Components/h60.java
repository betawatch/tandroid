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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public n20 c;
    public boolean d;
    public final /* synthetic */ i60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(i60 i60Var, Context context) {
        super(context);
        this.e = i60Var;
        this.b = new ArrayList();
    }

    public final void a(n20 n20Var, boolean z10) {
        int i7 = 1;
        this.d = true;
        i60 i60Var = this.e;
        i60Var.a2.k(n20Var, n20Var.getUid());
        AnimatorSet animatorSet = i60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i60Var.Y1.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            i60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new g60(this, i7));
            i60Var.Y1.setDuration(150L);
            i60Var.Y1.setInterpolator(kr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(n20Var);
    }

    public final void b(n20 n20Var) {
        this.d = false;
        i60 i60Var = this.e;
        i60Var.a2.l(n20Var.getUid());
        n20Var.setOnClickListener(null);
        AnimatorSet animatorSet = i60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i60Var.Y1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new f10(1, this, n20Var));
        i60Var.Y1.setDuration(150L);
        this.c = n20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<n20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<n20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<n20, Float>) View.ALPHA, 1.0f, 0.0f));
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
        v4.f1 K;
        final int i11;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l1 l1Var;
        int i12;
        i60 i60Var = this.e;
        org.telegram.ui.ActionBar.l1 l1Var2 = i60Var.Q1;
        di.b1 b1Var = i60Var.o1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof n20) {
                l1Var = l1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i14;
                if (!this.a) {
                    n20 n20Var = this.c;
                    if (childAt == n20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (n20Var != null) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.c) {
                    i14 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                l1Var = l1Var2;
            }
            i13++;
            l1Var2 = l1Var;
        }
        org.telegram.ui.ActionBar.l1 l1Var3 = l1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        int min = i60Var.h2 != null ? i60Var.b2 ? Math.min(i60Var.n2, L6) : 0 : i5.c.d(52.0f, Math.min(i60Var.n2, L6), 0);
        int i16 = i60Var.p2;
        int L7 = (i60Var.h2 != null || i60Var.a2.m() <= 0) ? 0 : org.telegram.messenger.g0.L(56.0f);
        i60Var.p2 = L7;
        if (min != i60Var.j2 || i16 != L7) {
            i60Var.j2 = min;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                i60Var.M1.h1(0, K.a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.d4(this, 9));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(i60Var.n2, L6);
        int i17 = i60Var.f2;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            i11 = 0;
            ofInt.addUpdateListener(new e60(this, 0));
            arrayList.add(ofInt);
        } else {
            i11 = 0;
        }
        boolean z10 = this.d;
        if (z10 && L6 > i60Var.n2) {
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.f60
                public final /* synthetic */ h60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            i60 i60Var2 = this.b.e;
                            i60Var2.Q1.smoothScrollTo(0, L6 - i60Var2.n2);
                            break;
                        default:
                            i60 i60Var3 = this.b.e;
                            i60Var3.Q1.smoothScrollTo(0, L6 - i60Var3.n2);
                            break;
                    }
                }
            });
        } else if (!z10 && l1Var3.getMeasuredHeight() + l1Var3.getScrollY() > L6) {
            final int i18 = 1;
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.f60
                public final /* synthetic */ h60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            i60 i60Var2 = this.b.e;
                            i60Var2.Q1.smoothScrollTo(0, L6 - i60Var2.n2);
                            break;
                        default:
                            i60 i60Var3 = this.b.e;
                            i60Var3.Q1.smoothScrollTo(0, L6 - i60Var3.n2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = i60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            i60Var.Y1.addListener(new g60(this, 0));
            i60Var.Y1.start();
            this.a = true;
        }
        if (i60Var.Y1 == null) {
            i60Var.f2 = min2;
            i60Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
