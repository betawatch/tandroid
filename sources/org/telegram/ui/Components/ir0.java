package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ir0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ck0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gt0 e;

    public ir0(gt0 gt0Var, ck0 ck0Var, SparseBooleanArray sparseBooleanArray, wz wzVar, int i7) {
        this.e = gt0Var;
        this.a = ck0Var;
        this.b = sparseBooleanArray;
        this.c = wzVar;
        this.d = i7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        gt0 gt0Var = this.e;
        gt0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ck0 ck0Var = this.a;
        v4.i0 adapter = ck0Var.getAdapter();
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == gt0Var.K || adapter == gt0Var.N || adapter == gt0Var.P || adapter == gt0Var.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = ck0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int o4 = gt0.o(ck0Var.getChildAt(i12));
                    if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                        gt0Var.S1.put(o4, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new hi.a4(this, o4, ck0Var));
                        ofFloat.addListener(new ki.f2(this, o4, 13));
                        ofFloat.setStartDelay((int) ((Math.min(ck0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / ck0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hr0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        ck0 ck0Var2 = ck0Var;
                                        if (ck0Var2.b1()) {
                                            ck0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ck0 ck0Var3 = ck0Var;
                                        if (ck0Var3.b1()) {
                                            ck0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        ck0 ck0Var4 = ck0Var;
                                        if (ck0Var4.b1()) {
                                            ck0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    ck0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = ck0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = ck0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(ck0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ck0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hr0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                ck0 ck0Var2 = ck0Var;
                                if (ck0Var2.b1()) {
                                    ck0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                ck0 ck0Var3 = ck0Var;
                                if (ck0Var3.b1()) {
                                    ck0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                ck0 ck0Var4 = ck0Var;
                                if (ck0Var4.b1()) {
                                    ck0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                ck0Var.addView(view);
                v4.p0 layoutManager = ck0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new q60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hr0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
                                case 0:
                                    ck0 ck0Var2 = ck0Var;
                                    if (ck0Var2.b1()) {
                                        ck0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    ck0 ck0Var3 = ck0Var;
                                    if (ck0Var3.b1()) {
                                        ck0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    ck0 ck0Var4 = ck0Var;
                                    if (ck0Var4.b1()) {
                                        ck0Var4.invalidate();
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
