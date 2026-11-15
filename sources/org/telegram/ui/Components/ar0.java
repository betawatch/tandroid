package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ar0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ uj0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ys0 e;

    public ar0(ys0 ys0Var, uj0 uj0Var, SparseBooleanArray sparseBooleanArray, pz pzVar, int i7) {
        this.e = ys0Var;
        this.a = uj0Var;
        this.b = sparseBooleanArray;
        this.c = pzVar;
        this.d = i7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ys0 ys0Var = this.e;
        ys0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final uj0 uj0Var = this.a;
        v4.h0 adapter = uj0Var.getAdapter();
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == ys0Var.K || adapter == ys0Var.N || adapter == ys0Var.P || adapter == ys0Var.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = uj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int o4 = ys0.o(uj0Var.getChildAt(i12));
                    if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                        ys0Var.S1.put(o4, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new hi.a4(this, o4, uj0Var));
                        ofFloat.addListener(new ki.j2(this, o4, 13));
                        ofFloat.setStartDelay((int) ((Math.min(uj0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / uj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zq0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        uj0 uj0Var2 = uj0Var;
                                        if (uj0Var2.b1()) {
                                            uj0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        uj0 uj0Var3 = uj0Var;
                                        if (uj0Var3.b1()) {
                                            uj0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        uj0 uj0Var4 = uj0Var;
                                        if (uj0Var4.b1()) {
                                            uj0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    uj0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = uj0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = uj0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(uj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / uj0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zq0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                uj0 uj0Var2 = uj0Var;
                                if (uj0Var2.b1()) {
                                    uj0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                uj0 uj0Var3 = uj0Var;
                                if (uj0Var3.b1()) {
                                    uj0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                uj0 uj0Var4 = uj0Var;
                                if (uj0Var4.b1()) {
                                    uj0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                uj0Var.addView(view);
                v4.o0 layoutManager = uj0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new h60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zq0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
                                case 0:
                                    uj0 uj0Var2 = uj0Var;
                                    if (uj0Var2.b1()) {
                                        uj0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    uj0 uj0Var3 = uj0Var;
                                    if (uj0Var3.b1()) {
                                        uj0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    uj0 uj0Var4 = uj0Var;
                                    if (uj0Var4.b1()) {
                                        uj0Var4.invalidate();
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
