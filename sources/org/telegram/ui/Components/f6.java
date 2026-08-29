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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class f6 extends LinearLayout {
    public static final Comparator r = Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new jf.d(14)), new jf.d(15));
    public final HashMap a;
    public final ArrayList b;
    public final vd.i c;
    public boolean d;
    public int e;
    public int f;
    public Runnable h;
    public float n;

    public f6(Context context) {
        super(context);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new vd.i(new u(this, 11), jr.h, 420L);
    }

    public final void a() {
        this.f = 0;
        this.e = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e6 e6Var = (e6) this.a.get(childAt);
            if (childAt.getVisibility() == 0 && e6Var != null && e6Var.b) {
                this.e = childAt.getMeasuredWidth() + this.e;
                this.f = childAt.getMeasuredHeight() + this.f;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            vd.f fVar = (vd.f) obj;
            View view = ((e6) fVar.a).a;
            RectF b10 = fVar.b();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + b10.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + b10.left) - view.getLeft());
            }
            f(view, fVar.c());
        }
        float f9 = getMetadata().g.a;
        if (this.n != f9) {
            this.n = f9;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final float c(float f9) {
        return (f9 * getMetadata().c.a) + getMetadata().g.a;
    }

    public final boolean d(View view) {
        e6 e6Var = (e6) this.a.get(view);
        return e6Var != null && e6Var.b;
    }

    public abstract void e();

    public void f(View view, float f9) {
        float lerp = AndroidUtilities.lerp(0.95f, 1.0f, f9);
        view.setAlpha(f9);
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

    public vd.h getMetadata() {
        return this.c.d;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.f;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.e;
    }

    public final void h(int i10, View view) {
        e6 e6Var = (e6) this.a.get(view);
        if (e6Var != null) {
            e6Var.d = i10;
        }
    }

    public final void i(View view, boolean z10, boolean z11) {
        e6 e6Var;
        if (view == null || (e6Var = (e6) this.a.get(view)) == null) {
            return;
        }
        View view2 = e6Var.a;
        if (e6Var.b != z10) {
            e6Var.b = z10;
            if (z10) {
                view2.setVisibility(0);
            }
            if (!z10 && !e6Var.c) {
                view2.setVisibility(8);
            }
            if (!z11) {
                this.d = true;
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ArrayList arrayList = this.b;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            e6 e6Var = (e6) this.a.get(childAt);
            if (e6Var != null) {
                e6Var.e = i14;
                if (childAt.getVisibility() == 0 && e6Var.b) {
                    arrayList.add(e6Var);
                }
            }
        }
        Collections.sort(arrayList, r);
        this.c.r(arrayList, !this.d);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            ((e6) obj).c = true;
        }
        this.d = false;
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.a.put(view, new e6(view));
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
