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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hj0 {
    public final ek0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public hj0(ek0 ek0Var, boolean z10) {
        this.a = ek0Var;
        this.e = z10;
        ek0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        int i7 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((AnimatorSet) arrayList2.get(i10)).end();
                ((AnimatorSet) arrayList2.get(i10)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            ek0 ek0Var = this.a;
            if (i7 >= size) {
                arrayList3.clear();
                this.b.clear();
                ek0Var.invalidate();
                this.d = true;
                return;
            }
            ek0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
            i7++;
        }
    }

    public final void b(int i7) {
        ek0 ek0Var = this.a;
        int childCount = ek0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ek0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof yz)) {
                view = childAt;
            }
        }
        v4.p0 layoutManager = ek0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            ek0Var.removeView(view);
            this.c.add(view);
            ek0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new h10(this, (yz) view, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.yp ypVar = new org.telegram.ui.yp(this, (yz) view, i7, i11);
        this.h.add(ypVar);
        ek0Var.getViewTreeObserver().addOnPreDrawListener(ypVar);
    }
}
