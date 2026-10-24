package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class tt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ tt0(KeyEvent.Callback callback, int i10, int i11) {
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
                xv0 xv0Var = (xv0) callback;
                xv0Var.k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                xv0Var.V(i11);
                break;
            default:
                s71 s71Var = (s71) callback;
                ai.u1 u1Var = s71Var.d;
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = u1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = u1Var.getChildAt(i12);
                    u1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && u1Var.getAdapter() == s71Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(u1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / u1Var.getMeasuredHeight()) * 100.0f);
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
