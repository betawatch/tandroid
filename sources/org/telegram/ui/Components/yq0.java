package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ tj0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ws0 e;

    public yq0(ws0 ws0Var, tj0 tj0Var, SparseBooleanArray sparseBooleanArray, iz izVar, int i3) {
        this.e = ws0Var;
        this.a = tj0Var;
        this.b = sparseBooleanArray;
        this.c = izVar;
        this.d = i3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ws0 ws0Var = this.e;
        ws0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final tj0 tj0Var = this.a;
        u4.h0 adapter = tj0Var.getAdapter();
        final int i3 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == ws0Var.K || adapter == ws0Var.N || adapter == ws0Var.P || adapter == ws0Var.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = tj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int o10 = ws0.o(tj0Var.getChildAt(i12));
                    if (o10 != 0 && sparseBooleanArray.get(o10, false)) {
                        ws0Var.S1.put(o10, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new gi.b4(this, o10, tj0Var));
                        ofFloat.addListener(new ii.m2(this, o10, 13));
                        ofFloat.setStartDelay((int) ((Math.min(tj0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / tj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xq0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        tj0 tj0Var2 = tj0Var;
                                        if (tj0Var2.b1()) {
                                            tj0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        tj0 tj0Var3 = tj0Var;
                                        if (tj0Var3.b1()) {
                                            tj0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        tj0 tj0Var4 = tj0Var;
                                        if (tj0Var4.b1()) {
                                            tj0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    tj0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = tj0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = tj0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(tj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / tj0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xq0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                tj0 tj0Var2 = tj0Var;
                                if (tj0Var2.b1()) {
                                    tj0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                tj0 tj0Var3 = tj0Var;
                                if (tj0Var3.b1()) {
                                    tj0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tj0 tj0Var4 = tj0Var;
                                if (tj0Var4.b1()) {
                                    tj0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                tj0Var.addView(view);
                u4.o0 layoutManager = tj0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new a60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xq0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    tj0 tj0Var2 = tj0Var;
                                    if (tj0Var2.b1()) {
                                        tj0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    tj0 tj0Var3 = tj0Var;
                                    if (tj0Var3.b1()) {
                                        tj0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    tj0 tj0Var4 = tj0Var;
                                    if (tj0Var4.b1()) {
                                        tj0Var4.invalidate();
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
