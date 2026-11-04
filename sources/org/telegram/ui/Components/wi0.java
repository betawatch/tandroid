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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wi0 {
    public final tj0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public wi0(tj0 tj0Var, boolean z10) {
        this.a = tj0Var;
        this.e = z10;
        tj0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        int i3 = 0;
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
            tj0 tj0Var = this.a;
            if (i3 >= size) {
                arrayList3.clear();
                this.b.clear();
                tj0Var.invalidate();
                this.d = true;
                return;
            }
            tj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i3));
            i3++;
        }
    }

    public final void b(int i3) {
        tj0 tj0Var = this.a;
        int childCount = tj0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof iz)) {
                view = childAt;
            }
        }
        u4.o0 layoutManager = tj0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            tj0Var.removeView(view);
            this.c.add(view);
            tj0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new ri0(this, (iz) view, layoutManager));
            ofFloat.start();
            i3--;
        }
        org.telegram.ui.tp tpVar = new org.telegram.ui.tp(this, (iz) view, i3, i11);
        this.h.add(tpVar);
        tj0Var.getViewTreeObserver().addOnPreDrawListener(tpVar);
    }
}
