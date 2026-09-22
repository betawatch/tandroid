package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ht0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ht0(KeyEvent.Callback callback, int i10, int i11) {
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
                lv0 lv0Var = (lv0) callback;
                lv0Var.k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                lv0Var.U(i11);
                break;
            default:
                e71 e71Var = (e71) callback;
                ai.w0 w0Var = e71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i11) {
                        if (S == 1 && w0Var.getAdapter() == e71Var.e && (childAt instanceof org.telegram.ui.Cells.w3)) {
                            childAt = ((org.telegram.ui.Cells.w3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(w0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / w0Var.getMeasuredHeight()) * 100.0f);
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
