package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ zk0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ hu0 e;

    public as0(hu0 hu0Var, zk0 zk0Var, SparseBooleanArray sparseBooleanArray, h00 h00Var, int i10) {
        this.e = hu0Var;
        this.a = zk0Var;
        this.b = sparseBooleanArray;
        this.c = h00Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        hu0 hu0Var = this.e;
        hu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final zk0 zk0Var = this.a;
        f2.q0 adapter = zk0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == hu0Var.D || adapter == hu0Var.G || adapter == hu0Var.I || adapter == hu0Var.H) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = zk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int p6 = hu0.p(zk0Var.getChildAt(i13));
                    if (p6 != 0 && sparseBooleanArray.get(p6, false)) {
                        hu0Var.K1.put(p6, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new lh.n4(this, p6, zk0Var));
                        ofFloat.addListener(new nh.n2(this, p6, 9));
                        ofFloat.setStartDelay((int) ((Math.min(zk0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / zk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zr0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        zk0 zk0Var2 = zk0Var;
                                        if (zk0Var2.b1()) {
                                            zk0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        zk0 zk0Var3 = zk0Var;
                                        if (zk0Var3.b1()) {
                                            zk0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        zk0 zk0Var4 = zk0Var;
                                        if (zk0Var4.b1()) {
                                            zk0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    zk0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = zk0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = zk0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(zk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / zk0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zr0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                zk0 zk0Var2 = zk0Var;
                                if (zk0Var2.b1()) {
                                    zk0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                zk0 zk0Var3 = zk0Var;
                                if (zk0Var3.b1()) {
                                    zk0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                zk0 zk0Var4 = zk0Var;
                                if (zk0Var4.b1()) {
                                    zk0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                zk0Var.addView(view);
                f2.x0 layoutManager = zk0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new sz(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zr0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    zk0 zk0Var2 = zk0Var;
                                    if (zk0Var2.b1()) {
                                        zk0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    zk0 zk0Var3 = zk0Var;
                                    if (zk0Var3.b1()) {
                                        zk0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    zk0 zk0Var4 = zk0Var;
                                    if (zk0Var4.b1()) {
                                        zk0Var4.invalidate();
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
