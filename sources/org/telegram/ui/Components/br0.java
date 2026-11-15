package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class br0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ br0(KeyEvent.Callback callback, int i7, int i10) {
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
                ys0Var.n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                ys0Var.e0(i10);
                break;
            default:
                e51 e51Var = (e51) callback;
                di.c1 c1Var = e51Var.o1;
                c1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = c1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = c1Var.getChildAt(i11);
                    c1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && c1Var.getAdapter() == e51Var.p1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(c1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / c1Var.getMeasuredHeight()) * 100.0f);
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
