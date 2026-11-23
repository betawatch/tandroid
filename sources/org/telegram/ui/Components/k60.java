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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public p20 c;
    public boolean d;
    public final /* synthetic */ l60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(l60 l60Var, Context context) {
        super(context);
        this.e = l60Var;
        this.b = new ArrayList();
    }

    public final void a(p20 p20Var, boolean z10) {
        int i7 = 1;
        this.d = true;
        l60 l60Var = this.e;
        l60Var.a2.k(p20Var, p20Var.getUid());
        AnimatorSet animatorSet = l60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            l60Var.Y1.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            l60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new j60(this, i7));
            l60Var.Y1.setDuration(150L);
            l60Var.Y1.setInterpolator(nr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(p20Var);
    }

    public final void b(p20 p20Var) {
        this.d = false;
        l60 l60Var = this.e;
        l60Var.a2.l(p20Var.getUid());
        p20Var.setOnClickListener(null);
        AnimatorSet animatorSet = l60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            l60Var.Y1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        l60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new h10(1, this, p20Var));
        l60Var.Y1.setDuration(150L);
        this.c = p20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<p20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<p20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<p20, Float>) View.ALPHA, 1.0f, 0.0f));
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
        l60 l60Var = this.e;
        org.telegram.ui.ActionBar.l1 l1Var2 = l60Var.Q1;
        di.b1 b1Var = l60Var.o1;
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
            if (childAt instanceof p20) {
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
                    p20 p20Var = this.c;
                    if (childAt == p20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (p20Var != null) {
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
        int min = l60Var.h2 != null ? l60Var.b2 ? Math.min(l60Var.n2, L6) : 0 : i5.c.d(52.0f, Math.min(l60Var.n2, L6), 0);
        int i16 = l60Var.p2;
        int L7 = (l60Var.h2 != null || l60Var.a2.m() <= 0) ? 0 : org.telegram.messenger.g0.L(56.0f);
        l60Var.p2 = L7;
        if (min != l60Var.j2 || i16 != L7) {
            l60Var.j2 = min;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                l60Var.M1.h1(0, K.a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.d4(this, 9));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(l60Var.n2, L6);
        int i17 = l60Var.f2;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            i11 = 0;
            ofInt.addUpdateListener(new h60(this, 0));
            arrayList.add(ofInt);
        } else {
            i11 = 0;
        }
        boolean z10 = this.d;
        if (z10 && L6 > l60Var.n2) {
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.i60
                public final /* synthetic */ k60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            l60 l60Var2 = this.b.e;
                            l60Var2.Q1.smoothScrollTo(0, L6 - l60Var2.n2);
                            break;
                        default:
                            l60 l60Var3 = this.b.e;
                            l60Var3.Q1.smoothScrollTo(0, L6 - l60Var3.n2);
                            break;
                    }
                }
            });
        } else if (!z10 && l1Var3.getMeasuredHeight() + l1Var3.getScrollY() > L6) {
            final int i18 = 1;
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.i60
                public final /* synthetic */ k60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            l60 l60Var2 = this.b.e;
                            l60Var2.Q1.smoothScrollTo(0, L6 - l60Var2.n2);
                            break;
                        default:
                            l60 l60Var3 = this.b.e;
                            l60Var3.Q1.smoothScrollTo(0, L6 - l60Var3.n2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = l60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            l60Var.Y1.addListener(new j60(this, 0));
            l60Var.Y1.start();
            this.a = true;
        }
        if (l60Var.Y1 == null) {
            l60Var.f2 = min2;
            l60Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
