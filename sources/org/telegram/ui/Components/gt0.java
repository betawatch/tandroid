package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ yl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ lv0 e;

    public gt0(lv0 lv0Var, yl0 yl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = lv0Var;
        this.a = yl0Var;
        this.b = sparseBooleanArray;
        this.c = t00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        lv0 lv0Var = this.e;
        lv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final yl0 yl0Var = this.a;
        s4.h0 adapter = yl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == lv0Var.H || adapter == lv0Var.K || adapter == lv0Var.M || adapter == lv0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = yl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = lv0.p(yl0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        lv0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ci.x4(this, p5, yl0Var));
                        ofFloat.addListener(new ei.v2(this, p5, 10));
                        ofFloat.setStartDelay((int) ((Math.min(yl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / yl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ft0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        yl0 yl0Var2 = yl0Var;
                                        if (yl0Var2.c1()) {
                                            yl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        yl0 yl0Var3 = yl0Var;
                                        if (yl0Var3.c1()) {
                                            yl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        yl0 yl0Var4 = yl0Var;
                                        if (yl0Var4.c1()) {
                                            yl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    yl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = yl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = yl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.S(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(yl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / yl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ft0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                yl0 yl0Var2 = yl0Var;
                                if (yl0Var2.c1()) {
                                    yl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                yl0 yl0Var3 = yl0Var;
                                if (yl0Var3.c1()) {
                                    yl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                yl0 yl0Var4 = yl0Var;
                                if (yl0Var4.c1()) {
                                    yl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                yl0Var.addView(view);
                s4.o0 layoutManager = yl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new gd0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ft0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    yl0 yl0Var2 = yl0Var;
                                    if (yl0Var2.c1()) {
                                        yl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    yl0 yl0Var3 = yl0Var;
                                    if (yl0Var3.c1()) {
                                        yl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    yl0 yl0Var4 = yl0Var;
                                    if (yl0Var4.c1()) {
                                        yl0Var4.invalidate();
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
