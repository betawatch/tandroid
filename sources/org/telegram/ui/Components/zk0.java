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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zk0 {
    public final sl0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public zk0(sl0 sl0Var, boolean z4) {
        this.a = sl0Var;
        this.e = z4;
        sl0Var.setItemsEnterAnimator(this);
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
            sl0 sl0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                sl0Var.invalidate();
                this.d = true;
                return;
            }
            sl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        sl0 sl0Var = this.a;
        int childCount = sl0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = sl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof t00)) {
                view = childAt;
            }
        }
        f2.v0 layoutManager = sl0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            sl0Var.removeView(view);
            this.c.add(view);
            sl0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new dg.y2(this, (t00) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq(this, (t00) view, i10, i12);
        this.h.add(vqVar);
        sl0Var.getViewTreeObserver().addOnPreDrawListener(vqVar);
    }
}
