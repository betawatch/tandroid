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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public s20 c;
    public boolean d;
    public final /* synthetic */ m60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(m60 m60Var, Context context) {
        super(context);
        this.e = m60Var;
        this.b = new ArrayList();
    }

    public final void a(s20 s20Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        m60 m60Var = this.e;
        m60Var.W1.k(s20Var, s20Var.getUid());
        AnimatorSet animatorSet = m60Var.U1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            m60Var.U1.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            m60Var.U1 = animatorSet2;
            animatorSet2.addListener(new k60(this, i10));
            m60Var.U1.setDuration(150L);
            m60Var.U1.setInterpolator(gr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(s20Var);
    }

    public final void b(s20 s20Var) {
        this.d = false;
        m60 m60Var = this.e;
        m60Var.W1.l(s20Var.getUid());
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = m60Var.U1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            m60Var.U1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        m60Var.U1 = animatorSet2;
        animatorSet2.addListener(new bg.f(25, this, s20Var));
        m60Var.U1.setDuration(150L);
        this.c = s20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<s20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<s20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<s20, Float>) View.ALPHA, 1.0f, 0.0f));
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
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.p1 p1Var;
        int i12;
        m60 m60Var = this.e;
        org.telegram.ui.ActionBar.p1 p1Var2 = m60Var.M1;
        ag.b1 b1Var = m60Var.k1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(26.0f);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof s20) {
                p1Var = p1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.i0.L(13.0f) + i14;
                if (!this.a) {
                    s20 s20Var = this.c;
                    if (childAt == s20Var) {
                        childAt.setTranslationX(org.telegram.messenger.i0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (s20Var != null) {
                        float f7 = L4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = L2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.c) {
                    i14 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                p1Var = p1Var2;
            }
            i13++;
            p1Var2 = p1Var;
        }
        org.telegram.ui.ActionBar.p1 p1Var3 = p1Var2;
        int L5 = org.telegram.messenger.i0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.i0.L(42.0f) + L2;
        int min = m60Var.d2 != null ? m60Var.X1 ? Math.min(m60Var.j2, L6) : 0 : i0.a.d(52.0f, Math.min(m60Var.j2, L6), 0);
        int i16 = m60Var.l2;
        int L7 = (m60Var.d2 != null || m60Var.W1.m() <= 0) ? 0 : org.telegram.messenger.i0.L(56.0f);
        m60Var.l2 = L7;
        if (min != m60Var.f2 || i16 != L7) {
            m60Var.f2 = min;
            if (b1Var.getAdapter() != null && b1Var.getAdapter().b() > 0 && (K = b1Var.K(0)) != null) {
                b1Var.getAdapter().g(0);
                m60Var.I1.h1(0, K.a.getTop() - b1Var.getPaddingTop());
                if (b1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bg.o(this, 7));
                    ofFloat.setDuration(b1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(m60Var.j2, L6);
        int i17 = m60Var.b2;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new a6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && L6 > m60Var.j2) {
            final int i18 = 0;
            org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.j60
                public final /* synthetic */ l60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            m60 m60Var2 = this.b.e;
                            m60Var2.M1.smoothScrollTo(0, L6 - m60Var2.j2);
                            break;
                        default:
                            m60 m60Var3 = this.b.e;
                            m60Var3.M1.smoothScrollTo(0, L6 - m60Var3.j2);
                            break;
                    }
                }
            });
        } else if (!z10 && p1Var3.getMeasuredHeight() + p1Var3.getScrollY() > L6) {
            final int i19 = 1;
            org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.j60
                public final /* synthetic */ l60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            m60 m60Var2 = this.b.e;
                            m60Var2.M1.smoothScrollTo(0, L6 - m60Var2.j2);
                            break;
                        default:
                            m60 m60Var3 = this.b.e;
                            m60Var3.M1.smoothScrollTo(0, L6 - m60Var3.j2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = m60Var.U1) != null) {
            animatorSet.playTogether(arrayList);
            m60Var.U1.addListener(new k60(this, 0));
            m60Var.U1.start();
            this.a = true;
        }
        if (m60Var.U1 == null) {
            m60Var.b2 = min2;
            m60Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        b1Var.setTranslationY(0.0f);
    }
}
