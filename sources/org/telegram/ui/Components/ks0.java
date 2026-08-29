package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ks0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ jl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qu0 e;

    public ks0(qu0 qu0Var, jl0 jl0Var, SparseBooleanArray sparseBooleanArray, p00 p00Var, int i10) {
        this.e = qu0Var;
        this.a = jl0Var;
        this.b = sparseBooleanArray;
        this.c = p00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        qu0 qu0Var = this.e;
        qu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final jl0 jl0Var = this.a;
        f2.p0 adapter = jl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == qu0Var.D || adapter == qu0Var.G || adapter == qu0Var.I || adapter == qu0Var.H) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = jl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p10 = qu0.p(jl0Var.getChildAt(i13));
                    if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                        qu0Var.K1.put(p10, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new bg.u(this, p10, jl0Var));
                        ofFloat.addListener(new org.telegram.ui.Cells.z3(this, p10, 7));
                        ofFloat.setStartDelay((int) ((Math.min(jl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / jl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.js0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        jl0 jl0Var2 = jl0Var;
                                        if (jl0Var2.b1()) {
                                            jl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        jl0 jl0Var3 = jl0Var;
                                        if (jl0Var3.b1()) {
                                            jl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        jl0 jl0Var4 = jl0Var;
                                        if (jl0Var4.b1()) {
                                            jl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    jl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = jl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = jl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(jl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.js0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                jl0 jl0Var2 = jl0Var;
                                if (jl0Var2.b1()) {
                                    jl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                jl0 jl0Var3 = jl0Var;
                                if (jl0Var3.b1()) {
                                    jl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                jl0 jl0Var4 = jl0Var;
                                if (jl0Var4.b1()) {
                                    jl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                jl0Var.addView(view);
                f2.w0 layoutManager = jl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new zz(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.js0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    jl0 jl0Var2 = jl0Var;
                                    if (jl0Var2.b1()) {
                                        jl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    jl0 jl0Var3 = jl0Var;
                                    if (jl0Var3.b1()) {
                                        jl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    jl0 jl0Var4 = jl0Var;
                                    if (jl0Var4.b1()) {
                                        jl0Var4.invalidate();
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
