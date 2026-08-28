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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dk0 {
    public final wk0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public dk0(wk0 wk0Var, boolean z10) {
        this.a = wk0Var;
        this.e = z10;
        wk0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.g;
        int i9 = 0;
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
            wk0 wk0Var = this.a;
            if (i9 >= size) {
                arrayList3.clear();
                this.b.clear();
                wk0Var.invalidate();
                this.d = true;
                return;
            }
            wk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i9));
            i9++;
        }
    }

    public final void b(int i9) {
        wk0 wk0Var = this.a;
        int childCount = wk0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof e00)) {
                view = childAt;
            }
        }
        f2.z0 layoutManager = wk0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            wk0Var.removeView(view);
            this.c.add(view);
            wk0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new fg.j(this, (e00) view, layoutManager));
            ofFloat.start();
            i9--;
        }
        org.telegram.ui.nq nqVar = new org.telegram.ui.nq(this, (e00) view, i9, i11);
        this.h.add(nqVar);
        wk0Var.getViewTreeObserver().addOnPreDrawListener(nqVar);
    }
}
