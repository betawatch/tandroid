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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gk0 {
    public final zk0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public gk0(zk0 zk0Var, boolean z10) {
        this.a = zk0Var;
        this.e = z10;
        zk0Var.setItemsEnterAnimator(this);
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
            zk0 zk0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                zk0Var.invalidate();
                this.d = true;
                return;
            }
            zk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        zk0 zk0Var = this.a;
        int childCount = zk0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zk0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof h00)) {
                view = childAt;
            }
        }
        f2.x0 layoutManager = zk0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            zk0Var.removeView(view);
            this.c.add(view);
            zk0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new ag.x1(this, (h00) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.pq pqVar = new org.telegram.ui.pq(this, (h00) view, i10, i12);
        this.h.add(pqVar);
        zk0Var.getViewTreeObserver().addOnPreDrawListener(pqVar);
    }
}
