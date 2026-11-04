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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s50 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public y10 c;
    public boolean d;
    public final /* synthetic */ t50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(t50 t50Var, Context context) {
        super(context);
        this.e = t50Var;
        this.b = new ArrayList();
    }

    public final void a(y10 y10Var, boolean z10) {
        int i3 = 1;
        this.d = true;
        t50 t50Var = this.e;
        t50Var.X1.k(y10Var, y10Var.getUid());
        AnimatorSet animatorSet = t50Var.V1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            t50Var.V1.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            t50Var.V1 = animatorSet2;
            animatorSet2.addListener(new r50(this, i3));
            t50Var.V1.setDuration(150L);
            t50Var.V1.setInterpolator(xq.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(y10Var);
    }

    public final void b(y10 y10Var) {
        this.d = false;
        t50 t50Var = this.e;
        t50Var.X1.l(y10Var.getUid());
        y10Var.setOnClickListener(null);
        AnimatorSet animatorSet = t50Var.V1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            t50Var.V1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        t50Var.V1 = animatorSet2;
        animatorSet2.addListener(new bh.j(29, this, y10Var));
        t50Var.V1.setDuration(150L);
        this.c = y10Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<y10, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<y10, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<y10, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList;
        u4.d1 K;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.k1 k1Var;
        int i11;
        t50 t50Var = this.e;
        org.telegram.ui.ActionBar.k1 k1Var2 = t50Var.N1;
        ci.j1 j1Var = t50Var.l1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i3);
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
            if (childAt instanceof y10) {
                k1Var = k1Var2;
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
                    y10 y10Var = this.c;
                    if (childAt == y10Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (y10Var != null) {
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
                k1Var = k1Var2;
            }
            i12++;
            k1Var2 = k1Var;
        }
        org.telegram.ui.ActionBar.k1 k1Var3 = k1Var2;
        int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
        final int L6 = org.telegram.messenger.g0.L(42.0f) + L2;
        int min = t50Var.e2 != null ? t50Var.Y1 ? Math.min(t50Var.k2, L6) : 0 : k2.p1.d(52.0f, Math.min(t50Var.k2, L6), 0);
        int i15 = t50Var.m2;
        int L7 = (t50Var.e2 != null || t50Var.X1.m() <= 0) ? 0 : org.telegram.messenger.g0.L(56.0f);
        t50Var.m2 = L7;
        if (min != t50Var.g2 || i15 != L7) {
            t50Var.g2 = min;
            if (j1Var.getAdapter() != null && j1Var.getAdapter().b() > 0 && (K = j1Var.K(0)) != null) {
                j1Var.getAdapter().g(0);
                t50Var.J1.h1(0, K.a.getTop() - j1Var.getPaddingTop());
                if (j1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ei.n4(this, 9));
                    ofFloat.setDuration(j1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(t50Var.k2, L6);
        int i16 = t50Var.c2;
        if (i16 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i16, min2);
            ofInt.addUpdateListener(new c6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && L6 > t50Var.k2) {
            final int i17 = 0;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.q50
                public final /* synthetic */ s50 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            t50 t50Var2 = this.b.e;
                            t50Var2.N1.smoothScrollTo(0, L6 - t50Var2.k2);
                            break;
                        default:
                            t50 t50Var3 = this.b.e;
                            t50Var3.N1.smoothScrollTo(0, L6 - t50Var3.k2);
                            break;
                    }
                }
            });
        } else if (!z10 && k1Var3.getMeasuredHeight() + k1Var3.getScrollY() > L6) {
            final int i18 = 1;
            org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.q50
                public final /* synthetic */ s50 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            t50 t50Var2 = this.b.e;
                            t50Var2.N1.smoothScrollTo(0, L6 - t50Var2.k2);
                            break;
                        default:
                            t50 t50Var3 = this.b.e;
                            t50Var3.N1.smoothScrollTo(0, L6 - t50Var3.k2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = t50Var.V1) != null) {
            animatorSet.playTogether(arrayList);
            t50Var.V1.addListener(new r50(this, 0));
            t50Var.V1.start();
            this.a = true;
        }
        if (t50Var.V1 == null) {
            t50Var.c2 = min2;
            t50Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        j1Var.setTranslationY(0.0f);
    }
}
