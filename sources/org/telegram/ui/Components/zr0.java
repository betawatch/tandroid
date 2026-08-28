package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zr0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ wk0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ eu0 e;

    public zr0(eu0 eu0Var, wk0 wk0Var, SparseBooleanArray sparseBooleanArray, e00 e00Var, int i9) {
        this.e = eu0Var;
        this.a = wk0Var;
        this.b = sparseBooleanArray;
        this.c = e00Var;
        this.d = i9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        eu0 eu0Var = this.e;
        eu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final wk0 wk0Var = this.a;
        f2.r0 adapter = wk0Var.getAdapter();
        final int i9 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (adapter == eu0Var.D || adapter == eu0Var.G || adapter == eu0Var.I || adapter == eu0Var.H) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = wk0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    int p6 = eu0.p(wk0Var.getChildAt(i12));
                    if (p6 != 0 && sparseBooleanArray.get(p6, false)) {
                        eu0Var.K1.put(p6, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new kh.p4(this, p6, wk0Var));
                        ofFloat.addListener(new mh.o2(this, p6, 9));
                        ofFloat.setStartDelay((int) ((Math.min(wk0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / wk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yr0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        wk0 wk0Var2 = wk0Var;
                                        if (wk0Var2.b1()) {
                                            wk0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        wk0 wk0Var3 = wk0Var;
                                        if (wk0Var3.b1()) {
                                            wk0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        wk0 wk0Var4 = wk0Var;
                                        if (wk0Var4.b1()) {
                                            wk0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    wk0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = wk0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt = wk0Var.getChildAt(i13);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(wk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wk0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yr0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                wk0 wk0Var2 = wk0Var;
                                if (wk0Var2.b1()) {
                                    wk0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                wk0 wk0Var3 = wk0Var;
                                if (wk0Var3.b1()) {
                                    wk0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                wk0 wk0Var4 = wk0Var;
                                if (wk0Var4.b1()) {
                                    wk0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                wk0Var.addView(view);
                f2.z0 layoutManager = wk0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new r60(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yr0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i9) {
                                case 0:
                                    wk0 wk0Var2 = wk0Var;
                                    if (wk0Var2.b1()) {
                                        wk0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    wk0 wk0Var3 = wk0Var;
                                    if (wk0Var3.b1()) {
                                        wk0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    wk0 wk0Var4 = wk0Var;
                                    if (wk0Var4.b1()) {
                                        wk0Var4.invalidate();
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
