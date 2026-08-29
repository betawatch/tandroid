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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pk0 {
    public final jl0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public pk0(jl0 jl0Var, boolean z10) {
        this.a = jl0Var;
        this.e = z10;
        jl0Var.setItemsEnterAnimator(this);
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
            jl0 jl0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                jl0Var.invalidate();
                this.d = true;
                return;
            }
            jl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        jl0 jl0Var = this.a;
        int childCount = jl0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof p00)) {
                view = childAt;
            }
        }
        f2.w0 layoutManager = jl0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            jl0Var.removeView(view);
            this.c.add(view);
            jl0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new ok0(this, (p00) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.pq pqVar = new org.telegram.ui.pq(this, (p00) view, i10, i12);
        this.h.add(pqVar);
        jl0Var.getViewTreeObserver().addOnPreDrawListener(pqVar);
    }
}
