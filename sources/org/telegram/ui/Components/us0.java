package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class us0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ml0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zu0 e;

    public us0(zu0 zu0Var, ml0 ml0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = zu0Var;
        this.a = ml0Var;
        this.b = sparseBooleanArray;
        this.c = t00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zu0 zu0Var = this.e;
        zu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ml0 ml0Var = this.a;
        s4.h0 adapter = ml0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == zu0Var.H || adapter == zu0Var.K || adapter == zu0Var.M || adapter == zu0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = ml0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = zu0.p(ml0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        zu0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ci.x4(this, p5, ml0Var));
                        ofFloat.addListener(new ei.v2(this, p5, 10));
                        ofFloat.setStartDelay((int) ((Math.min(ml0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / ml0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ts0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        ml0 ml0Var2 = ml0Var;
                                        if (ml0Var2.c1()) {
                                            ml0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ml0 ml0Var3 = ml0Var;
                                        if (ml0Var3.c1()) {
                                            ml0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        ml0 ml0Var4 = ml0Var;
                                        if (ml0Var4.c1()) {
                                            ml0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    ml0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = ml0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = ml0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.S(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(ml0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ml0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ts0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                ml0 ml0Var2 = ml0Var;
                                if (ml0Var2.c1()) {
                                    ml0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                ml0 ml0Var3 = ml0Var;
                                if (ml0Var3.c1()) {
                                    ml0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                ml0 ml0Var4 = ml0Var;
                                if (ml0Var4.c1()) {
                                    ml0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                ml0Var.addView(view);
                s4.o0 layoutManager = ml0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new jd0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ts0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    ml0 ml0Var2 = ml0Var;
                                    if (ml0Var2.c1()) {
                                        ml0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    ml0 ml0Var3 = ml0Var;
                                    if (ml0Var3.c1()) {
                                        ml0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    ml0 ml0Var4 = ml0Var;
                                    if (ml0Var4.c1()) {
                                        ml0Var4.invalidate();
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
