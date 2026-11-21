package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kr0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ek0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ jt0 e;

    public kr0(jt0 jt0Var, ek0 ek0Var, SparseBooleanArray sparseBooleanArray, yz yzVar, int i7) {
        this.e = jt0Var;
        this.a = ek0Var;
        this.b = sparseBooleanArray;
        this.c = yzVar;
        this.d = i7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        jt0 jt0Var = this.e;
        jt0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ek0 ek0Var = this.a;
        v4.i0 adapter = ek0Var.getAdapter();
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == jt0Var.K || adapter == jt0Var.N || adapter == jt0Var.P || adapter == jt0Var.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = ek0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int o4 = jt0.o(ek0Var.getChildAt(i12));
                    if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                        jt0Var.S1.put(o4, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new hi.z3(this, o4, ek0Var));
                        ofFloat.addListener(new ki.e2(this, o4, 13));
                        ofFloat.setStartDelay((int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.jr0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        ek0 ek0Var2 = ek0Var;
                                        if (ek0Var2.b1()) {
                                            ek0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ek0 ek0Var3 = ek0Var;
                                        if (ek0Var3.b1()) {
                                            ek0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        ek0 ek0Var4 = ek0Var;
                                        if (ek0Var4.b1()) {
                                            ek0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    ek0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = ek0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = ek0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.jr0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                ek0 ek0Var2 = ek0Var;
                                if (ek0Var2.b1()) {
                                    ek0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                ek0 ek0Var3 = ek0Var;
                                if (ek0Var3.b1()) {
                                    ek0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                ek0 ek0Var4 = ek0Var;
                                if (ek0Var4.b1()) {
                                    ek0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                ek0Var.addView(view);
                v4.p0 layoutManager = ek0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new s60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.jr0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
                                case 0:
                                    ek0 ek0Var2 = ek0Var;
                                    if (ek0Var2.b1()) {
                                        ek0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    ek0 ek0Var3 = ek0Var;
                                    if (ek0Var3.b1()) {
                                        ek0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    ek0 ek0Var4 = ek0Var;
                                    if (ek0Var4.b1()) {
                                        ek0Var4.invalidate();
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
