package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ zl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qv0 e;

    public lt0(qv0 qv0Var, zl0 zl0Var, SparseBooleanArray sparseBooleanArray, w00 w00Var, int i10) {
        this.e = qv0Var;
        this.a = zl0Var;
        this.b = sparseBooleanArray;
        this.c = w00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        qv0 qv0Var = this.e;
        qv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final zl0 zl0Var = this.a;
        s4.h0 adapter = zl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == qv0Var.H || adapter == qv0Var.K || adapter == qv0Var.M || adapter == qv0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = zl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = qv0.p(zl0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        qv0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ci.w4(this, p5, zl0Var));
                        ofFloat.addListener(new ei.w2(this, p5, 10));
                        ofFloat.setStartDelay((int) ((Math.min(zl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / zl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kt0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        zl0 zl0Var2 = zl0Var;
                                        if (zl0Var2.b1()) {
                                            zl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        zl0 zl0Var3 = zl0Var;
                                        if (zl0Var3.b1()) {
                                            zl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        zl0 zl0Var4 = zl0Var;
                                        if (zl0Var4.b1()) {
                                            zl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    zl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = zl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = zl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(zl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / zl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kt0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                zl0 zl0Var2 = zl0Var;
                                if (zl0Var2.b1()) {
                                    zl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                zl0 zl0Var3 = zl0Var;
                                if (zl0Var3.b1()) {
                                    zl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                zl0 zl0Var4 = zl0Var;
                                if (zl0Var4.b1()) {
                                    zl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                zl0Var.addView(view);
                s4.o0 layoutManager = zl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new hd0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kt0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    zl0 zl0Var2 = zl0Var;
                                    if (zl0Var2.b1()) {
                                        zl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    zl0 zl0Var3 = zl0Var;
                                    if (zl0Var3.b1()) {
                                        zl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    zl0 zl0Var4 = zl0Var;
                                    if (zl0Var4.b1()) {
                                        zl0Var4.invalidate();
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
