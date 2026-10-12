package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class st0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ mm0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xv0 e;

    public st0(xv0 xv0Var, mm0 mm0Var, SparseBooleanArray sparseBooleanArray, f10 f10Var, int i10) {
        this.e = xv0Var;
        this.a = mm0Var;
        this.b = sparseBooleanArray;
        this.c = f10Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        xv0 xv0Var = this.e;
        xv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final mm0 mm0Var = this.a;
        s4.g0 adapter = mm0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == xv0Var.H || adapter == xv0Var.K || adapter == xv0Var.M || adapter == xv0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = mm0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = xv0.p(mm0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        xv0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new di.v4(this, p5, mm0Var));
                        ofFloat.addListener(new fi.v2(this, p5, 11));
                        ofFloat.setStartDelay((int) ((Math.min(mm0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / mm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rt0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        mm0 mm0Var2 = mm0Var;
                                        if (mm0Var2.b1()) {
                                            mm0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        mm0 mm0Var3 = mm0Var;
                                        if (mm0Var3.b1()) {
                                            mm0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        mm0 mm0Var4 = mm0Var;
                                        if (mm0Var4.b1()) {
                                            mm0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    mm0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = mm0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = mm0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(mm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / mm0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rt0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                mm0 mm0Var2 = mm0Var;
                                if (mm0Var2.b1()) {
                                    mm0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                mm0 mm0Var3 = mm0Var;
                                if (mm0Var3.b1()) {
                                    mm0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                mm0 mm0Var4 = mm0Var;
                                if (mm0Var4.b1()) {
                                    mm0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                mm0Var.addView(view);
                s4.n0 layoutManager = mm0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new k90(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rt0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    mm0 mm0Var2 = mm0Var;
                                    if (mm0Var2.b1()) {
                                        mm0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    mm0 mm0Var3 = mm0Var;
                                    if (mm0Var3.b1()) {
                                        mm0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    mm0 mm0Var4 = mm0Var;
                                    if (mm0Var4.b1()) {
                                        mm0Var4.invalidate();
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
