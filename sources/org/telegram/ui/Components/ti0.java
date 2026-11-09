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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ti0 {
    public final qj0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ti0(qj0 qj0Var, boolean z9) {
        this.a = qj0Var;
        this.e = z9;
        qj0Var.setItemsEnterAnimator(this);
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
            qj0 qj0Var = this.a;
            if (i7 >= size) {
                arrayList3.clear();
                this.b.clear();
                qj0Var.invalidate();
                this.d = true;
                return;
            }
            qj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
            i7++;
        }
    }

    public final void b(int i7) {
        qj0 qj0Var = this.a;
        int childCount = qj0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof mz)) {
                view = childAt;
            }
        }
        v4.n0 layoutManager = qj0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            qj0Var.removeView(view);
            this.c.add(view);
            qj0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new w50(this, (mz) view, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.xp xpVar = new org.telegram.ui.xp(this, (mz) view, i7, i11);
        this.h.add(xpVar);
        qj0Var.getViewTreeObserver().addOnPreDrawListener(xpVar);
    }
}
