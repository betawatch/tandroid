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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xi0 {
    public final uj0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public xi0(uj0 uj0Var, boolean z10) {
        this.a = uj0Var;
        this.e = z10;
        uj0Var.setItemsEnterAnimator(this);
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
            uj0 uj0Var = this.a;
            if (i7 >= size) {
                arrayList3.clear();
                this.b.clear();
                uj0Var.invalidate();
                this.d = true;
                return;
            }
            uj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
            i7++;
        }
    }

    public final void b(int i7) {
        uj0 uj0Var = this.a;
        int childCount = uj0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = uj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof pz)) {
                view = childAt;
            }
        }
        v4.o0 layoutManager = uj0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            uj0Var.removeView(view);
            this.c.add(view);
            uj0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new y50(this, (pz) view, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.xp xpVar = new org.telegram.ui.xp(this, (pz) view, i7, i11);
        this.h.add(xpVar);
        uj0Var.getViewTreeObserver().addOnPreDrawListener(xpVar);
    }
}
