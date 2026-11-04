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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q00 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public y10 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ r00 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q00(r00 r00Var, Context context) {
        super(context);
        this.r = r00Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
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
        int y9;
        int i11;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i3);
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
            if (childAt instanceof y10) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    i12 = i13;
                } else {
                    i12 = i13;
                    if (childAt.getMeasuredWidth() + i15 > L) {
                        L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                        i15 = i12;
                    }
                }
                if (childAt.getMeasuredWidth() + i16 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
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
                    i15 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i15);
                }
                i16 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i16);
            } else {
                i12 = i13;
            }
            i14++;
            i13 = i12;
        }
        int i17 = i13;
        if (org.telegram.messenger.g0.Q1()) {
            y9 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.q;
            y9 = org.telegram.messenger.camera.q.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i15 < y9) {
            L2 += org.telegram.messenger.g0.L(40.0f);
        }
        if (L - i16 < y9) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        boolean z10 = this.b;
        r00 r00Var = this.r;
        if (z10) {
            i11 = i17;
        } else {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            r00Var.n = L2;
            if (this.a != null) {
                this.h = org.telegram.messenger.g0.L(42.0f) + L2;
                this.a.playTogether(arrayList);
                i11 = i17;
                this.a.addListener(new p00(this, i11));
                this.f = org.telegram.messenger.hs.f(r00Var.a).q(null, this.f, true);
                this.a.start();
                this.b = true;
            } else {
                i11 = i17;
                this.h = L5;
            }
        }
        int i18 = this.n;
        r00Var.e = i18 > 0 ? org.telegram.messenger.g0.L(40.0f) + i18 : i11;
        setMeasuredDimension(size, this.h);
        o00 o00Var = r00Var.f;
        if (o00Var != null) {
            o00Var.a(r00Var.e);
        }
    }
}
