package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ pj0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xs0 e;

    public yq0(xs0 xs0Var, pj0 pj0Var, SparseBooleanArray sparseBooleanArray, mz mzVar, int i7) {
        this.e = xs0Var;
        this.a = pj0Var;
        this.b = sparseBooleanArray;
        this.c = mzVar;
        this.d = i7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        xs0 xs0Var = this.e;
        xs0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final pj0 pj0Var = this.a;
        v4.g0 adapter = pj0Var.getAdapter();
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == xs0Var.J || adapter == xs0Var.M || adapter == xs0Var.O || adapter == xs0Var.N) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = pj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int o4 = xs0.o(pj0Var.getChildAt(i12));
                    if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                        xs0Var.R1.put(o4, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new fi.e4(this, o4, pj0Var));
                        ofFloat.addListener(new hi.m2(this, o4, 13));
                        ofFloat.setStartDelay((int) ((Math.min(pj0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / pj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xq0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        pj0 pj0Var2 = pj0Var;
                                        if (pj0Var2.b1()) {
                                            pj0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        pj0 pj0Var3 = pj0Var;
                                        if (pj0Var3.b1()) {
                                            pj0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        pj0 pj0Var4 = pj0Var;
                                        if (pj0Var4.b1()) {
                                            pj0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    pj0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = pj0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = pj0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(pj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / pj0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xq0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                pj0 pj0Var2 = pj0Var;
                                if (pj0Var2.b1()) {
                                    pj0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                pj0 pj0Var3 = pj0Var;
                                if (pj0Var3.b1()) {
                                    pj0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                pj0 pj0Var4 = pj0Var;
                                if (pj0Var4.b1()) {
                                    pj0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                pj0Var.addView(view);
                v4.n0 layoutManager = pj0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new e60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xq0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
                                case 0:
                                    pj0 pj0Var2 = pj0Var;
                                    if (pj0Var2.b1()) {
                                        pj0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    pj0 pj0Var3 = pj0Var;
                                    if (pj0Var3.b1()) {
                                        pj0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    pj0 pj0Var4 = pj0Var;
                                    if (pj0Var4.b1()) {
                                        pj0Var4.invalidate();
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
