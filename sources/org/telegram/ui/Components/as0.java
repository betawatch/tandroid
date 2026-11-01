package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ uk0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ au0 e;

    public as0(au0 au0Var, uk0 uk0Var, SparseBooleanArray sparseBooleanArray, zz zzVar, int i10) {
        this.e = au0Var;
        this.a = uk0Var;
        this.b = sparseBooleanArray;
        this.c = zzVar;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        au0 au0Var = this.e;
        au0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final uk0 uk0Var = this.a;
        s4.g0 adapter = uk0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == au0Var.J || adapter == au0Var.M || adapter == au0Var.O || adapter == au0Var.N) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = uk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int n10 = au0.n(uk0Var.getChildAt(i13));
                    if (n10 != 0 && sparseBooleanArray.get(n10, false)) {
                        au0Var.R1.put(n10, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new jg.p(this, n10, uk0Var));
                        ofFloat.addListener(new bi.d5(this, n10, 12));
                        ofFloat.setStartDelay((int) ((Math.min(uk0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / uk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zr0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        uk0 uk0Var2 = uk0Var;
                                        if (uk0Var2.b1()) {
                                            uk0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        uk0 uk0Var3 = uk0Var;
                                        if (uk0Var3.b1()) {
                                            uk0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        uk0 uk0Var4 = uk0Var;
                                        if (uk0Var4.b1()) {
                                            uk0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    uk0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = uk0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = uk0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(uk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / uk0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zr0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                uk0 uk0Var2 = uk0Var;
                                if (uk0Var2.b1()) {
                                    uk0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                uk0 uk0Var3 = uk0Var;
                                if (uk0Var3.b1()) {
                                    uk0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                uk0 uk0Var4 = uk0Var;
                                if (uk0Var4.b1()) {
                                    uk0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                uk0Var.addView(view);
                s4.n0 layoutManager = uk0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new t60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zr0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    uk0 uk0Var2 = uk0Var;
                                    if (uk0Var2.b1()) {
                                        uk0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    uk0 uk0Var3 = uk0Var;
                                    if (uk0Var3.b1()) {
                                        uk0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    uk0 uk0Var4 = uk0Var;
                                    if (uk0Var4.b1()) {
                                        uk0Var4.invalidate();
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
