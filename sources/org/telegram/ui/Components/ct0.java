package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ct0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ vl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ iv0 e;

    public ct0(iv0 iv0Var, vl0 vl0Var, SparseBooleanArray sparseBooleanArray, a10 a10Var, int i10) {
        this.e = iv0Var;
        this.a = vl0Var;
        this.b = sparseBooleanArray;
        this.c = a10Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        iv0 iv0Var = this.e;
        iv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final vl0 vl0Var = this.a;
        s4.h0 adapter = vl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == iv0Var.H || adapter == iv0Var.K || adapter == iv0Var.M || adapter == iv0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = vl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = iv0.p(vl0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        iv0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new bi.s5(this, p5, vl0Var));
                        ofFloat.addListener(new di.y2(this, p5, 10));
                        ofFloat.setStartDelay((int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.bt0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        vl0 vl0Var2 = vl0Var;
                                        if (vl0Var2.a1()) {
                                            vl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        vl0 vl0Var3 = vl0Var;
                                        if (vl0Var3.a1()) {
                                            vl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        vl0 vl0Var4 = vl0Var;
                                        if (vl0Var4.a1()) {
                                            vl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    vl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = vl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = vl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.bt0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                vl0 vl0Var2 = vl0Var;
                                if (vl0Var2.a1()) {
                                    vl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                vl0 vl0Var3 = vl0Var;
                                if (vl0Var3.a1()) {
                                    vl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                vl0 vl0Var4 = vl0Var;
                                if (vl0Var4.a1()) {
                                    vl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                vl0Var.addView(view);
                s4.o0 layoutManager = vl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new zn0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.bt0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    vl0 vl0Var2 = vl0Var;
                                    if (vl0Var2.a1()) {
                                        vl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    vl0 vl0Var3 = vl0Var;
                                    if (vl0Var3.a1()) {
                                        vl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    vl0 vl0Var4 = vl0Var;
                                    if (vl0Var4.a1()) {
                                        vl0Var4.invalidate();
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
