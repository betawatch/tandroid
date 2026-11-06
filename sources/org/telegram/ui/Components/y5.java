package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class y5 extends LinearLayout {
    public static final Comparator r = Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bg.d(17)), new bg.d(18));
    public final HashMap a;
    public final ArrayList b;
    public final te.h c;
    public boolean d;
    public int e;
    public int f;
    public Runnable h;
    public float n;

    public y5(Context context) {
        super(context);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new te.h(new u(this, 11), xq.h, 420L);
    }

    public final void a() {
        this.f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            x5 x5Var = (x5) this.a.get(childAt);
            if (childAt.getVisibility() == 0 && x5Var != null && x5Var.b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f = childAt.getMeasuredHeight() + this.f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            View view = ((x5) eVar.a).a;
            RectF b10 = eVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, eVar.c());
        }
        float f10 = getMetadata().g.a;
        if (this.n != f10) {
            this.n = f10;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f10) {
        return (f10 * getMetadata().c.a) + getMetadata().g.a;
    }

    public final boolean d(View view) {
        x5 x5Var = (x5) this.a.get(view);
        return x5Var != null && x5Var.b;
    }

    public abstract void e();

    public void f(View view, float f10) {
        float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public final void g(View view) {
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.c.b.size();
    }

    public te.g getMetadata() {
        return this.c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i7, View view) {
        x5 x5Var = (x5) this.a.get(view);
        if (x5Var != null) {
            x5Var.d = i7;
        }
    }

    public final void i(View view, boolean z9, boolean z10) {
        x5 x5Var;
        if (view == null || (x5Var = (x5) this.a.get(view)) == null) {
            return;
        }
        View view2 = x5Var.a;
        if (x5Var.b != z9) {
            x5Var.b = z9;
            if (z9) {
                view2.setVisibility(0);
            }
            if (!z9 && !x5Var.c) {
                view2.setVisibility(8);
            }
            if (!z10) {
                this.d = true;
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ArrayList arrayList = this.b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            x5 x5Var = (x5) this.a.get(childAt);
            if (x5Var != null) {
                x5Var.e = i13;
                if (childAt.getVisibility() == 0 && x5Var.b) {
                    arrayList.add(x5Var);
                }
            }
        }
        Collections.sort(arrayList, r);
        this.c.m(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((x5) obj).c = true;
        }
        this.d = false;
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        a();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.a.put(view, new x5(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view);
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.h = runnable;
    }
}
