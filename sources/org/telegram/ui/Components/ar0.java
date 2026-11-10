package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ar0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ar0(KeyEvent.Callback callback, int i7, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = i7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i7 = this.a;
        int i10 = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i7) {
            case 0:
                ys0 ys0Var = (ys0) callback;
                ys0Var.m0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                ys0Var.e0(i10);
                break;
            default:
                c51 c51Var = (c51) callback;
                bi.q1 q1Var = c51Var.n1;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = q1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    q1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && q1Var.getAdapter() == c51Var.o1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(q1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / q1Var.getMeasuredHeight()) * 100.0f);
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
