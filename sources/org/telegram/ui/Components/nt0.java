package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ im0 a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ sv0 e;

    public nt0(sv0 sv0Var, im0 im0Var, SparseBooleanArray sparseBooleanArray, b10 b10Var, int i10) {
        this.e = sv0Var;
        this.a = im0Var;
        this.b = sparseBooleanArray;
        this.c = b10Var;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        sv0 sv0Var = this.e;
        sv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final im0 im0Var = this.a;
        s4.g0 adapter = im0Var.getAdapter();
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        if (adapter == sv0Var.H || adapter == sv0Var.K || adapter == sv0Var.M || adapter == sv0Var.L) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = im0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    int q6 = sv0.q(im0Var.getChildAt(i13));
                    if (q6 != 0 && sparseBooleanArray.get(q6, false)) {
                        sv0Var.O1.put(q6, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ei.o4(this, q6, im0Var));
                        ofFloat.addListener(new gi.p2(this, q6, 11));
                        ofFloat.setStartDelay((int) ((Math.min(im0Var.getMeasuredHeight(), Math.max(0, r10.getTop())) / im0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.mt0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        im0 im0Var2 = im0Var;
                                        if (im0Var2.b1()) {
                                            im0Var2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        im0 im0Var3 = im0Var;
                                        if (im0Var3.b1()) {
                                            im0Var3.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        im0 im0Var4 = im0Var;
                                        if (im0Var4.b1()) {
                                            im0Var4.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    im0Var.invalidate();
                }
            }
            return true;
        }
        int childCount2 = im0Var.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt = im0Var.getChildAt(i14);
            View view = this.c;
            if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(im0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / im0Var.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.mt0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                im0 im0Var2 = im0Var;
                                if (im0Var2.b1()) {
                                    im0Var2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                im0 im0Var3 = im0Var;
                                if (im0Var3.b1()) {
                                    im0Var3.invalidate();
                                    break;
                                }
                                break;
                            default:
                                im0 im0Var4 = im0Var;
                                if (im0Var4.b1()) {
                                    im0Var4.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (view != null && view.getParent() == null) {
                im0Var.addView(view);
                s4.n0 layoutManager = im0Var.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.M(view);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                    ofFloat3.addListener(new c80(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.mt0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    im0 im0Var2 = im0Var;
                                    if (im0Var2.b1()) {
                                        im0Var2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    im0 im0Var3 = im0Var;
                                    if (im0Var3.b1()) {
                                        im0Var3.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    im0 im0Var4 = im0Var;
                                    if (im0Var4.b1()) {
                                        im0Var4.invalidate();
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
