package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ar0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ qj0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zs0 e;

    public ar0(zs0 zs0Var, qj0 qj0Var, SparseBooleanArray sparseBooleanArray, mz mzVar, int i7) {
        this.e = zs0Var;
        this.a = qj0Var;
        this.b = sparseBooleanArray;
        this.c = mzVar;
        this.d = i7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zs0 zs0Var = this.e;
        zs0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final qj0 qj0Var = this.a;
        v4.g0 adapter = qj0Var.getAdapter();
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == zs0Var.J || adapter == zs0Var.M || adapter == zs0Var.O || adapter == zs0Var.N) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = qj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int o4 = zs0.o(qj0Var.getChildAt(i12));
                    if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                        zs0Var.R1.put(o4, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new fi.e4(this, o4, qj0Var));
                        ofFloat.addListener(new hi.m2(this, o4, 13));
                        ofFloat.setStartDelay((int) ((Math.min(qj0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / qj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zq0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        qj0 qj0Var2 = qj0Var;
                                        if (qj0Var2.b1()) {
                                            qj0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        qj0 qj0Var3 = qj0Var;
                                        if (qj0Var3.b1()) {
                                            qj0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        qj0 qj0Var4 = qj0Var;
                                        if (qj0Var4.b1()) {
                                            qj0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    qj0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = qj0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = qj0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(qj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qj0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zq0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                qj0 qj0Var2 = qj0Var;
                                if (qj0Var2.b1()) {
                                    qj0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                qj0 qj0Var3 = qj0Var;
                                if (qj0Var3.b1()) {
                                    qj0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                qj0 qj0Var4 = qj0Var;
                                if (qj0Var4.b1()) {
                                    qj0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                qj0Var.addView(view);
                v4.n0 layoutManager = qj0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new f60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zq0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i7) {
                                case 0:
                                    qj0 qj0Var2 = qj0Var;
                                    if (qj0Var2.b1()) {
                                        qj0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    qj0 qj0Var3 = qj0Var;
                                    if (qj0Var3.b1()) {
                                        qj0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    qj0 qj0Var4 = qj0Var;
                                    if (qj0Var4.b1()) {
                                        qj0Var4.invalidate();
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
