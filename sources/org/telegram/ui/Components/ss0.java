package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ss0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ll0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xu0 e;

    public ss0(xu0 xu0Var, ll0 ll0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = xu0Var;
        this.a = ll0Var;
        this.b = sparseBooleanArray;
        this.c = t00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        xu0 xu0Var = this.e;
        xu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ll0 ll0Var = this.a;
        s4.h0 adapter = ll0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == xu0Var.H || adapter == xu0Var.K || adapter == xu0Var.M || adapter == xu0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = ll0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = xu0.p(ll0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        xu0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new di.x4(this, p5, ll0Var));
                        ofFloat.addListener(new fi.v2(this, p5, 10));
                        ofFloat.setStartDelay((int) ((Math.min(ll0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / ll0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rs0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        ll0 ll0Var2 = ll0Var;
                                        if (ll0Var2.a1()) {
                                            ll0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ll0 ll0Var3 = ll0Var;
                                        if (ll0Var3.a1()) {
                                            ll0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        ll0 ll0Var4 = ll0Var;
                                        if (ll0Var4.a1()) {
                                            ll0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    ll0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = ll0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = ll0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(ll0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ll0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rs0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                ll0 ll0Var2 = ll0Var;
                                if (ll0Var2.a1()) {
                                    ll0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                ll0 ll0Var3 = ll0Var;
                                if (ll0Var3.a1()) {
                                    ll0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                ll0 ll0Var4 = ll0Var;
                                if (ll0Var4.a1()) {
                                    ll0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                ll0Var.addView(view);
                s4.o0 layoutManager = ll0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new r80(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rs0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    ll0 ll0Var2 = ll0Var;
                                    if (ll0Var2.a1()) {
                                        ll0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    ll0 ll0Var3 = ll0Var;
                                    if (ll0Var3.a1()) {
                                        ll0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    ll0 ll0Var4 = ll0Var;
                                    if (ll0Var4.a1()) {
                                        ll0Var4.invalidate();
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
