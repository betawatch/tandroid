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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class al0 {
    public final vl0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public al0(vl0 vl0Var, boolean z10) {
        this.a = vl0Var;
        this.e = z10;
        vl0Var.setItemsEnterAnimator(this);
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
            vl0 vl0Var = this.a;
            if (i10 >= size) {
                arrayList3.clear();
                this.b.clear();
                vl0Var.invalidate();
                this.d = true;
                return;
            }
            vl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
            i10++;
        }
    }

    public final void b(int i10) {
        vl0 vl0Var = this.a;
        int childCount = vl0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = vl0Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof t00)) {
                view = childAt;
            }
        }
        s4.o0 layoutManager = vl0Var.getLayoutManager();
        int i12 = 2;
        if (view != null && layoutManager != null) {
            vl0Var.removeView(view);
            this.c.add(view);
            vl0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new ai.z(this, (t00) view, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, (t00) view, i10, i12);
        this.h.add(zqVar);
        vl0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}
