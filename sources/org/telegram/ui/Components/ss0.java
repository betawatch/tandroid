package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ss0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ sl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yu0 e;

    public ss0(yu0 yu0Var, sl0 sl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = yu0Var;
        this.a = sl0Var;
        this.b = sparseBooleanArray;
        this.c = t00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        yu0 yu0Var = this.e;
        yu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final sl0 sl0Var = this.a;
        f2.o0 adapter = sl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == yu0Var.E || adapter == yu0Var.H || adapter == yu0Var.J || adapter == yu0Var.I) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = sl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p10 = yu0.p(sl0Var.getChildAt(i13));
                    if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                        yu0Var.L1.put(p10, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new dg.t(this, p10, sl0Var));
                        ofFloat.addListener(new org.telegram.ui.Cells.b4(this, p10, 7));
                        ofFloat.setStartDelay((int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rs0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        sl0 sl0Var2 = sl0Var;
                                        if (sl0Var2.b1()) {
                                            sl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        sl0 sl0Var3 = sl0Var;
                                        if (sl0Var3.b1()) {
                                            sl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        sl0 sl0Var4 = sl0Var;
                                        if (sl0Var4.b1()) {
                                            sl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    sl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = sl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = sl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rs0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                sl0 sl0Var2 = sl0Var;
                                if (sl0Var2.b1()) {
                                    sl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                sl0 sl0Var3 = sl0Var;
                                if (sl0Var3.b1()) {
                                    sl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                sl0 sl0Var4 = sl0Var;
                                if (sl0Var4.b1()) {
                                    sl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                sl0Var.addView(view);
                f2.v0 layoutManager = sl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new nd0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rs0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    sl0 sl0Var2 = sl0Var;
                                    if (sl0Var2.b1()) {
                                        sl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    sl0 sl0Var3 = sl0Var;
                                    if (sl0Var3.b1()) {
                                        sl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    sl0 sl0Var4 = sl0Var;
                                    if (sl0Var4.b1()) {
                                        sl0Var4.invalidate();
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
