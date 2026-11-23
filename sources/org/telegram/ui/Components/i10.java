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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i10 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public p20 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ j10 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(j10 j10Var, Context context) {
        super(context);
        this.r = j10Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
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
        int z10;
        int i11;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i13 = 0;
        if (!this.b) {
            this.n = 0;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.c;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt instanceof p20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    i12 = i13;
                } else {
                    i12 = i13;
                    if (childAt.getMeasuredWidth() + i15 > L) {
                        L2 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L2);
                        i15 = i12;
                    }
                }
                if (childAt.getMeasuredWidth() + i16 > L) {
                    L3 = org.telegram.messenger.f3.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i16 = i12;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i15;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i16);
                        childAt.setTranslationY(L3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                        this.n = Math.max(this.n, L2);
                    } else {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            float[] fArr = new float[1];
                            fArr[i12] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr2 = new float[1];
                            fArr2[i12] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, L2);
                    }
                }
                if (!contains) {
                    i15 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.f3.C(9.0f, childAt.getMeasuredWidth(), i16);
            } else {
                i12 = i13;
            }
            i14++;
            i13 = i12;
        }
        int i17 = i13;
        if (org.telegram.messenger.g0.Q1()) {
            z10 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.q;
            z10 = org.telegram.messenger.o10.z(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i15 < z10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i16 < z10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z11 = this.b;
        j10 j10Var = this.r;
        if (z11) {
            i11 = i17;
        } else {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            j10Var.n = L2;
            if (this.a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.a.playTogether(arrayList);
                i11 = i17;
                this.a.addListener(new g10(this, i11));
                this.f = org.telegram.messenger.ls.f(j10Var.a).q(null, this.f, true);
                this.a.start();
                this.b = true;
            } else {
                i11 = i17;
                this.h = L5;
            }
        }
        int i18 = this.n;
        j10Var.e = i18 > 0 ? org.telegram.messenger.g0.L(40.0f) + i18 : i11;
        setMeasuredDimension(size, this.h);
        f10 f10Var = j10Var.f;
        if (f10Var != null) {
            f10Var.a(j10Var.e);
        }
    }
}
