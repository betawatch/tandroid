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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wj0 {
    public final tk0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public wj0(tk0 tk0Var, boolean z10) {
        this.a = tk0Var;
        this.e = z10;
        tk0Var.setItemsEnterAnimator(this);
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
            tk0 tk0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                tk0Var.invalidate();
                this.d = true;
                return;
            }
            tk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        tk0 tk0Var = this.a;
        int childCount = tk0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tk0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof zz)) {
                view = childAt;
            }
        }
        s4.n0 layoutManager = tk0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            tk0Var.removeView(view);
            this.c.add(view);
            tk0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new bg.f(this, (zz) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.uq uqVar = new org.telegram.ui.uq(this, (zz) view, i10, i12);
        this.h.add(uqVar);
        tk0Var.getViewTreeObserver().addOnPreDrawListener(uqVar);
    }
}
