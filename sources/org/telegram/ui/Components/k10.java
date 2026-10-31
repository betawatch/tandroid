package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k10 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public s20 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ l10 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(l10 l10Var, Context context) {
        super(context);
        this.r = l10Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
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
        int y3;
        int i12;
        int i13;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(26.0f);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i14 = 0;
        if (!this.b) {
            this.n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof s20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (childAt.getMeasuredWidth() + i16 > L) {
                        L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                        i16 = i13;
                    }
                }
                if (childAt.getMeasuredWidth() + i17 > L) {
                    L3 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i17 = i13;
                }
                int L4 = org.telegram.messenger.i0.L(13.0f) + i16;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(org.telegram.messenger.i0.L(13.0f) + i17);
                        childAt.setTranslationY(L3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.n = Math.max(this.n, L2);
                    } else {
                        float f7 = L4;
                        if (childAt.getTranslationX() != f7) {
                            float[] fArr = new float[1];
                            fArr[i13] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f10 = L2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[i13] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, L2);
                    }
                }
                if (!contains) {
                    i16 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i16);
                }
                i17 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i17);
            } else {
                i13 = i14;
            }
            i15++;
            i14 = i13;
        }
        int i18 = i14;
        if (org.telegram.messenger.i0.Q1()) {
            y3 = org.telegram.messenger.i0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.i0.q;
            y3 = org.telegram.messenger.z20.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i16 < y3) {
            L2 += org.telegram.messenger.i0.L(40.0f);
        }
        if (L - i17 < y3) {
            L3 += org.telegram.messenger.i0.L(40.0f);
        }
        boolean z10 = this.b;
        l10 l10Var = this.r;
        if (z10) {
            i12 = i18;
        } else {
            int L5 = org.telegram.messenger.i0.L(42.0f) + L3;
            l10Var.n = L2;
            if (this.a != null) {
                this.h = org.telegram.messenger.i0.L(42.0f) + L2;
                this.a.playTogether(arrayList);
                i12 = i18;
                this.a.addListener(new j10(this, i12));
                this.f = org.telegram.messenger.zs.f(l10Var.a).q(null, this.f, true);
                this.a.start();
                this.b = true;
            } else {
                i12 = i18;
                this.h = L5;
            }
        }
        int i19 = this.n;
        l10Var.e = i19 > 0 ? org.telegram.messenger.i0.L(40.0f) + i19 : i12;
        setMeasuredDimension(size, this.h);
        i10 i10Var = l10Var.f;
        if (i10Var != null) {
            i10Var.a(l10Var.e);
        }
    }
}
