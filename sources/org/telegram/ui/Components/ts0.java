package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ tl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zu0 e;

    public ts0(zu0 zu0Var, tl0 tl0Var, SparseBooleanArray sparseBooleanArray, u00 u00Var, int i10) {
        this.e = zu0Var;
        this.a = tl0Var;
        this.b = sparseBooleanArray;
        this.c = u00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zu0 zu0Var = this.e;
        zu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final tl0 tl0Var = this.a;
        f2.p0 adapter = tl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == zu0Var.E || adapter == zu0Var.H || adapter == zu0Var.J || adapter == zu0Var.I) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = tl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p10 = zu0.p(tl0Var.getChildAt(i13));
                    if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                        zu0Var.L1.put(p10, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new eg.s(this, p10, tl0Var));
                        ofFloat.addListener(new org.telegram.ui.Cells.b4(this, p10, 7));
                        ofFloat.setStartDelay((int) ((Math.min(tl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / tl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ss0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        tl0 tl0Var2 = tl0Var;
                                        if (tl0Var2.b1()) {
                                            tl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        tl0 tl0Var3 = tl0Var;
                                        if (tl0Var3.b1()) {
                                            tl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        tl0 tl0Var4 = tl0Var;
                                        if (tl0Var4.b1()) {
                                            tl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    tl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = tl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = tl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(tl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / tl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ss0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                tl0 tl0Var2 = tl0Var;
                                if (tl0Var2.b1()) {
                                    tl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                tl0 tl0Var3 = tl0Var;
                                if (tl0Var3.b1()) {
                                    tl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                tl0 tl0Var4 = tl0Var;
                                if (tl0Var4.b1()) {
                                    tl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                tl0Var.addView(view);
                f2.w0 layoutManager = tl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new pd0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ss0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    tl0 tl0Var2 = tl0Var;
                                    if (tl0Var2.b1()) {
                                        tl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    tl0 tl0Var3 = tl0Var;
                                    if (tl0Var3.b1()) {
                                        tl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    tl0 tl0Var4 = tl0Var;
                                    if (tl0Var4.b1()) {
                                        tl0Var4.invalidate();
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
