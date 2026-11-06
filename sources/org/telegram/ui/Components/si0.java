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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class si0 {
    public final pj0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public si0(pj0 pj0Var, boolean z9) {
        this.a = pj0Var;
        this.e = z9;
        pj0Var.setItemsEnterAnimator(this);
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
            pj0 pj0Var = this.a;
            if (i7 >= size) {
                arrayList3.clear();
                this.b.clear();
                pj0Var.invalidate();
                this.d = true;
                return;
            }
            pj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
            i7++;
        }
    }

    public final void b(int i7) {
        pj0 pj0Var = this.a;
        int childCount = pj0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = pj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof lz)) {
                view = childAt;
            }
        }
        v4.n0 layoutManager = pj0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            pj0Var.removeView(view);
            this.c.add(view);
            pj0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new v50(this, (lz) view, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.vp vpVar = new org.telegram.ui.vp(this, (lz) view, i7, i11);
        this.h.add(vpVar);
        pj0Var.getViewTreeObserver().addOnPreDrawListener(vpVar);
    }
}
