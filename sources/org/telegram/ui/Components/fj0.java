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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fj0 {
    public final ck0 a;
    public boolean d;
    public final boolean e;
    public final SparseArray b = new SparseArray();
    public final HashSet c = new HashSet();
    public final boolean f = true;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public fj0(ck0 ck0Var, boolean z10) {
        this.a = ck0Var;
        this.e = z10;
        ck0Var.setItemsEnterAnimator(this);
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
            ck0 ck0Var = this.a;
            if (i7 >= size) {
                arrayList3.clear();
                this.b.clear();
                ck0Var.invalidate();
                this.d = true;
                return;
            }
            ck0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
            i7++;
        }
    }

    public final void b(int i7) {
        ck0 ck0Var = this.a;
        int childCount = ck0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ck0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof wz)) {
                view = childAt;
            }
        }
        v4.p0 layoutManager = ck0Var.getLayoutManager();
        int i11 = 2;
        if (view != null && layoutManager != null) {
            ck0Var.removeView(view);
            this.c.add(view);
            ck0Var.addView(view);
            layoutManager.M(view);
            Animator ofFloat = this.f ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(new h60(this, (wz) view, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.yp ypVar = new org.telegram.ui.yp(this, (wz) view, i7, i11);
        this.h.add(ypVar);
        ck0Var.getViewTreeObserver().addOnPreDrawListener(ypVar);
    }
}
