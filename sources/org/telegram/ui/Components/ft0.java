package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ft0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ wl0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ kv0 e;

    public ft0(kv0 kv0Var, wl0 wl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = kv0Var;
        this.a = wl0Var;
        this.b = sparseBooleanArray;
        this.c = t00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        kv0 kv0Var = this.e;
        kv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final wl0 wl0Var = this.a;
        s4.h0 adapter = wl0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == kv0Var.H || adapter == kv0Var.K || adapter == kv0Var.M || adapter == kv0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = wl0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p5 = kv0.p(wl0Var.getChildAt(i13));
                    if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                        kv0Var.O1.put(p5, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ci.x4(this, p5, wl0Var));
                        ofFloat.addListener(new ei.v2(this, p5, 10));
                        ofFloat.setStartDelay((int) ((Math.min(wl0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / wl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.et0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        wl0 wl0Var2 = wl0Var;
                                        if (wl0Var2.c1()) {
                                            wl0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        wl0 wl0Var3 = wl0Var;
                                        if (wl0Var3.c1()) {
                                            wl0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        wl0 wl0Var4 = wl0Var;
                                        if (wl0Var4.c1()) {
                                            wl0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    wl0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = wl0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = wl0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.S(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(wl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wl0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.et0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                wl0 wl0Var2 = wl0Var;
                                if (wl0Var2.c1()) {
                                    wl0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                wl0 wl0Var3 = wl0Var;
                                if (wl0Var3.c1()) {
                                    wl0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                wl0 wl0Var4 = wl0Var;
                                if (wl0Var4.c1()) {
                                    wl0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                wl0Var.addView(view);
                s4.o0 layoutManager = wl0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new ed0(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.et0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    wl0 wl0Var2 = wl0Var;
                                    if (wl0Var2.c1()) {
                                        wl0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    wl0 wl0Var3 = wl0Var;
                                    if (wl0Var3.c1()) {
                                        wl0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    wl0 wl0Var4 = wl0Var;
                                    if (wl0Var4.c1()) {
                                        wl0Var4.invalidate();
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
