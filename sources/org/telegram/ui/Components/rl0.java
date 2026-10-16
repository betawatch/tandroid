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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rl0 {
    public final mm0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public rl0(mm0 mm0Var, boolean z10) {
        this.a = mm0Var;
        this.e = z10;
        mm0Var.setItemsEnterAnimator(this);
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
            mm0 mm0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                mm0Var.invalidate();
                this.d = true;
                return;
            }
            mm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        mm0 mm0Var = this.a;
        int childCount = mm0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof f10)) {
                view = childAt;
            }
        }
        s4.n0 layoutManager = mm0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            mm0Var.removeView(view);
            this.c.add(view);
            mm0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new bi.t(this, (f10) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.fr frVar = new org.telegram.ui.fr(this, (f10) view, i10, i12);
        this.h.add(frVar);
        mm0Var.getViewTreeObserver().addOnPreDrawListener(frVar);
    }
}
