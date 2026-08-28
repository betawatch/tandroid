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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class a6 extends LinearLayout {
    public static final Comparator r = Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new ff.d(14)), new ff.d(15));
    public final HashMap a;
    public final ArrayList b;
    public final td.h c;
    public boolean d;
    public int e;
    public int f;
    public Runnable h;
    public float n;

    public a6(Context context) {
        super(context);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new td.h(new s(this, 11), gr.h, 420L);
    }

    public final void a() {
        this.f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            z5 z5Var = (z5) this.a.get(childAt);
            if (childAt.getVisibility() == 0 && z5Var != null && z5Var.b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f = childAt.getMeasuredHeight() + this.f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            td.e eVar = (td.e) obj;
            View view = ((z5) eVar.a).a;
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
        z5 z5Var = (z5) this.a.get(view);
        return z5Var != null && z5Var.b;
    }

    public abstract void e();

    public void f(View view, float f10) {
        float lerp = AndroidUtilities.lerp(0.95f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void g(View view) {
    }

    public float getAnimatedHeightWithPadding() {
        return c(getPaddingBottom() + getPaddingTop());
    }

    public int getEntriesCount() {
        return this.c.b.size();
    }

    public td.g getMetadata() {
        return this.c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i9, View view) {
        z5 z5Var = (z5) this.a.get(view);
        if (z5Var != null) {
            z5Var.d = i9;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        z5 z5Var;
        if (view == null || (z5Var = (z5) this.a.get(view)) == null) {
            return;
        }
        View view2 = z5Var.a;
        if (z5Var.b != z10) {
            z5Var.b = z10;
            if (z10) {
                view2.setVisibility(0);
            }
            if (!z10 && !z5Var.c) {
                view2.setVisibility(8);
            }
            if (!z11) {
                this.d = true;
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ArrayList arrayList = this.b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            z5 z5Var = (z5) this.a.get(childAt);
            if (z5Var != null) {
                z5Var.e = i13;
                if (childAt.getVisibility() == 0 && z5Var.b) {
                    arrayList.add(z5Var);
                }
            }
        }
        Collections.sort(arrayList, r);
        this.c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            ((z5) obj).c = true;
        }
        this.d = false;
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        a();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.a.put(view, new z5(view));
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
