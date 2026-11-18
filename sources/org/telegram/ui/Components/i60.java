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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public m20 c;
    public boolean d;
    public final /* synthetic */ j60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(j60 j60Var, Context context) {
        super(context);
        this.e = j60Var;
        this.b = new ArrayList();
    }

    public final void a(m20 m20Var, boolean z10) {
        int i7 = 1;
        this.d = true;
        j60 j60Var = this.e;
        j60Var.a2.k(m20Var, m20Var.getUid());
        AnimatorSet animatorSet = j60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            j60Var.Y1.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            j60Var.Y1 = animatorSet2;
            animatorSet2.addListener(new g60(this, i7));
            j60Var.Y1.setDuration(150L);
            j60Var.Y1.setInterpolator(lr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(m20Var);
    }

    public final void b(m20 m20Var) {
        int i7 = 0;
        this.d = false;
        j60 j60Var = this.e;
        j60Var.a2.l(m20Var.getUid());
        m20Var.setOnClickListener(null);
        AnimatorSet animatorSet = j60Var.Y1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            j60Var.Y1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        j60Var.Y1 = animatorSet2;
        animatorSet2.addListener(new h60(i7, this, m20Var));
        j60Var.Y1.setDuration(150L);
        this.c = m20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<m20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<m20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<m20, Float>) View.ALPHA, 1.0f, 0.0f));
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
        org.telegram.ui.ActionBar.m1 m1Var;
        int i12;
        j60 j60Var = this.e;
        org.telegram.ui.ActionBar.m1 m1Var2 = j60Var.Q1;
        di.b1 b1Var = j60Var.o1;
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
            if (childAt instanceof m20) {
                m1Var = m1Var2;
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
                    m20 m20Var = this.c;
                    if (childAt == m20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (m20Var != null) {
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
                m1Var = m1Var2;
            }
            i13++;
            m1Var2 = m1Var;
        }
        org.telegram.ui.ActionBar.m1 m1Var3 = m1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        int min = j60Var.h2 != null ? j60Var.b2 ? Math.min(j60Var.n2, L6) : 0 : i5.c.d(52.0f, Math.min(j60Var.n2, L6), 0);
        int i16 = j60Var.p2;
        int L7 = (j60Var.h2 != null || j60Var.a2.m() <= 0) ? 0 : org.telegram.messenger.g0.L(56.0f);
        j60Var.p2 = L7;
        if (min != j60Var.j2 || i16 != L7) {
            j60Var.j2 = min;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                j60Var.M1.h1(0, K.a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new fi.d4(this, 9));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(j60Var.n2, L6);
        int i17 = j60Var.f2;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            i11 = 0;
            ofInt.addUpdateListener(new e60(this, 0));
            arrayList.add(ofInt);
        } else {
            i11 = 0;
        }
        boolean z10 = this.d;
        if (z10 && L6 > j60Var.n2) {
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.f60
                public final /* synthetic */ i60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            j60 j60Var2 = this.b.e;
                            j60Var2.Q1.smoothScrollTo(0, L6 - j60Var2.n2);
                            break;
                        default:
                            j60 j60Var3 = this.b.e;
                            j60Var3.Q1.smoothScrollTo(0, L6 - j60Var3.n2);
                            break;
                    }
                }
            });
        } else if (!z10 && m1Var3.getMeasuredHeight() + m1Var3.getScrollY() > L6) {
            final int i18 = 1;
            org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.f60
                public final /* synthetic */ i60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            j60 j60Var2 = this.b.e;
                            j60Var2.Q1.smoothScrollTo(0, L6 - j60Var2.n2);
                            break;
                        default:
                            j60 j60Var3 = this.b.e;
                            j60Var3.Q1.smoothScrollTo(0, L6 - j60Var3.n2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = j60Var.Y1) != null) {
            animatorSet.playTogether(arrayList);
            j60Var.Y1.addListener(new g60(this, 0));
            j60Var.Y1.start();
            this.a = true;
        }
        if (j60Var.Y1 == null) {
            j60Var.f2 = min2;
            j60Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
