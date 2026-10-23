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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ol0 {
    public final jm0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ol0(jm0 jm0Var, boolean z10) {
        this.a = jm0Var;
        this.e = z10;
        jm0Var.setItemsEnterAnimator(this);
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
            jm0 jm0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                jm0Var.invalidate();
                this.d = true;
                return;
            }
            jm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        jm0 jm0Var = this.a;
        int childCount = jm0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof b10)) {
                view = childAt;
            }
        }
        s4.n0 layoutManager = jm0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            jm0Var.removeView(view);
            this.c.add(view);
            jm0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new nl0(this, (b10) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.oq oqVar = new org.telegram.ui.oq(this, (b10) view, i10, i12);
        this.h.add(oqVar);
        jm0Var.getViewTreeObserver().addOnPreDrawListener(oqVar);
    }
}
