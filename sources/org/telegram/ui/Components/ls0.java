package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ls0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ls0(KeyEvent.Callback callback, int i10, int i11) {
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
                qu0 qu0Var = (qu0) callback;
                qu0Var.g0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                qu0Var.U(i11);
                break;
            default:
                f61 f61Var = (f61) callback;
                jh.e1 e1Var = f61Var.d;
                e1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = e1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = e1Var.getChildAt(i12);
                    e1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && e1Var.getAdapter() == f61Var.e && (childAt instanceof org.telegram.ui.Cells.s3)) {
                            childAt = ((org.telegram.ui.Cells.s3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(e1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e1Var.getMeasuredHeight()) * 100.0f);
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
