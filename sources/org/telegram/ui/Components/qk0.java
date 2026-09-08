package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qk0 {
    public final ll0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public qk0(ll0 ll0Var, boolean z10) {
        this.a = ll0Var;
        this.e = z10;
        ll0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        int i10 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((AnimatorSet) arrayList2.get(i11)).end();
                ((AnimatorSet) arrayList2.get(i11)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            ll0 ll0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                ll0Var.invalidate();
                this.d = true;
                return;
            }
            ll0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        ll0 ll0Var = this.a;
        int childCount = ll0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ll0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof t00)) {
                view = childAt;
            }
        }
        s4.o0 layoutManager = ll0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            ll0Var.removeView(view);
            this.c.add(view);
            ll0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new bi.t(this, (t00) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.cr crVar = new org.telegram.ui.cr(this, (t00) view, i10, i12);
        this.h.add(crVar);
        ll0Var.getViewTreeObserver().addOnPreDrawListener(crVar);
    }
}
