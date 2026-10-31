package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ as0(KeyEvent.Callback callback, int i10, int i11) {
        this.a = i11;
        this.c = callback;
        this.b = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        int i11 = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                zt0 zt0Var = (zt0) callback;
                zt0Var.m0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                zt0Var.c0(i11);
                break;
            default:
                e61 e61Var = (e61) callback;
                ag.b1 b1Var = e61Var.k1;
                b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    b1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && b1Var.getAdapter() == e61Var.l1 && (childAt instanceof org.telegram.ui.Cells.z3)) {
                            childAt = ((org.telegram.ui.Cells.z3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(b1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / b1Var.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
        }
        return true;
    }
}
