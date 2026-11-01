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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xj0 {
    public final uk0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public xj0(uk0 uk0Var, boolean z10) {
        this.a = uk0Var;
        this.e = z10;
        uk0Var.setItemsEnterAnimator(this);
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
            uk0 uk0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                uk0Var.invalidate();
                this.d = true;
                return;
            }
            uk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        uk0 uk0Var = this.a;
        int childCount = uk0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = uk0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof zz)) {
                view = childAt;
            }
        }
        s4.n0 layoutManager = uk0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            uk0Var.removeView(view);
            this.c.add(view);
            uk0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new bg.f(this, (zz) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.uq uqVar = new org.telegram.ui.uq(this, (zz) view, i10, i12);
        this.h.add(uqVar);
        uk0Var.getViewTreeObserver().addOnPreDrawListener(uqVar);
    }
}
