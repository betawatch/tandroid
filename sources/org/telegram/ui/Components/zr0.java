package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zr0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ tk0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zt0 e;

    public zr0(zt0 zt0Var, tk0 tk0Var, SparseBooleanArray sparseBooleanArray, zz zzVar, int i10) {
        this.e = zt0Var;
        this.a = tk0Var;
        this.b = sparseBooleanArray;
        this.c = zzVar;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zt0 zt0Var = this.e;
        zt0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final tk0 tk0Var = this.a;
        s4.g0 adapter = tk0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == zt0Var.J || adapter == zt0Var.M || adapter == zt0Var.O || adapter == zt0Var.N) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = tk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int n10 = zt0.n(tk0Var.getChildAt(i13));
                    if (n10 != 0 && sparseBooleanArray.get(n10, false)) {
                        zt0Var.R1.put(n10, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new jg.p(this, n10, tk0Var));
                        ofFloat.addListener(new bi.d5(this, n10, 12));
                        ofFloat.setStartDelay((int) ((Math.min(tk0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / tk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yr0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        tk0 tk0Var2 = tk0Var;
                                        if (tk0Var2.b1()) {
                                            tk0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        tk0 tk0Var3 = tk0Var;
                                        if (tk0Var3.b1()) {
                                            tk0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        tk0 tk0Var4 = tk0Var;
                                        if (tk0Var4.b1()) {
                                            tk0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    tk0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = tk0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = tk0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(tk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / tk0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yr0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                tk0 tk0Var2 = tk0Var;
                                if (tk0Var2.b1()) {
                                    tk0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                tk0 tk0Var3 = tk0Var;
                                if (tk0Var3.b1()) {
                                    tk0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tk0 tk0Var4 = tk0Var;
                                if (tk0Var4.b1()) {
                                    tk0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                tk0Var.addView(view);
                s4.n0 layoutManager = tk0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new t60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yr0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    tk0 tk0Var2 = tk0Var;
                                    if (tk0Var2.b1()) {
                                        tk0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    tk0 tk0Var3 = tk0Var;
                                    if (tk0Var3.b1()) {
                                        tk0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    tk0 tk0Var4 = tk0Var;
                                    if (tk0Var4.b1()) {
                                        tk0Var4.invalidate();
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
