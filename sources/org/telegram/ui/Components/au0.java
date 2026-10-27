package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class au0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bw0 e;

    public au0(bw0 bw0Var, nm0 nm0Var, SparseBooleanArray sparseBooleanArray, c10 c10Var, int i10) {
        this.e = bw0Var;
        this.a = nm0Var;
        this.b = sparseBooleanArray;
        this.c = c10Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        bw0 bw0Var = this.e;
        bw0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final nm0 nm0Var = this.a;
        s4.h0 adapter = nm0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == bw0Var.J || adapter == bw0Var.M || adapter == bw0Var.O || adapter == bw0Var.N) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = nm0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int r6 = bw0.r(nm0Var.getChildAt(i13));
                    if (r6 != 0 && sparseBooleanArray.get(r6, false)) {
                        bw0Var.R1.put(r6, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new fi.n4(this, r6, nm0Var));
                        ofFloat.addListener(new hi.y2(this, r6, 11));
                        ofFloat.setStartDelay((int) ((Math.min(nm0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / nm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zt0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        nm0 nm0Var2 = nm0Var;
                                        if (nm0Var2.b1()) {
                                            nm0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        nm0 nm0Var3 = nm0Var;
                                        if (nm0Var3.b1()) {
                                            nm0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        nm0 nm0Var4 = nm0Var;
                                        if (nm0Var4.b1()) {
                                            nm0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    nm0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = nm0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = nm0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(nm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / nm0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zt0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                nm0 nm0Var2 = nm0Var;
                                if (nm0Var2.b1()) {
                                    nm0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                nm0 nm0Var3 = nm0Var;
                                if (nm0Var3.b1()) {
                                    nm0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                nm0 nm0Var4 = nm0Var;
                                if (nm0Var4.b1()) {
                                    nm0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                nm0Var.addView(view);
                s4.p0 layoutManager = nm0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new i10(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zt0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    nm0 nm0Var2 = nm0Var;
                                    if (nm0Var2.b1()) {
                                        nm0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    nm0 nm0Var3 = nm0Var;
                                    if (nm0Var3.b1()) {
                                        nm0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    nm0 nm0Var4 = nm0Var;
                                    if (nm0Var4.b1()) {
                                        nm0Var4.invalidate();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    ofFloat3.start();
                }
            }
        }
        animatorSet.start();
        return true;
    }
}
