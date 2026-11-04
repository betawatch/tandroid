package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zq0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ zq0(KeyEvent.Callback callback, int i3, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = i3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i3 = this.a;
        int i10 = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i3) {
            case 0:
                ws0 ws0Var = (ws0) callback;
                ws0Var.n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                ws0Var.e0(i10);
                break;
            default:
                v41 v41Var = (v41) callback;
                ci.j1 j1Var = v41Var.l1;
                j1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = j1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = j1Var.getChildAt(i11);
                    j1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && j1Var.getAdapter() == v41Var.m1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(j1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / j1Var.getMeasuredHeight()) * 100.0f);
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
