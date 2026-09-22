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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dl0 {
    public final yl0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public dl0(yl0 yl0Var, boolean z10) {
        this.a = yl0Var;
        this.e = z10;
        yl0Var.setItemsEnterAnimator(this);
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
            yl0 yl0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                yl0Var.invalidate();
                this.d = true;
                return;
            }
            yl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        yl0 yl0Var = this.a;
        int childCount = yl0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = yl0Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof t00)) {
                view = childAt;
            }
        }
        s4.o0 layoutManager = yl0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            yl0Var.removeView(view);
            this.c.add(view);
            yl0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new ai.z(this, (t00) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, (t00) view, i10, i12);
        this.h.add(zqVar);
        yl0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}
