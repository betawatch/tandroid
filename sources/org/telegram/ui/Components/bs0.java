package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bs0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ bs0(KeyEvent.Callback callback, int i10, int i11) {
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
                hu0 hu0Var = (hu0) callback;
                hu0Var.g0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                hu0Var.U(i11);
                break;
            default:
                u51 u51Var = (u51) callback;
                hh.f1 f1Var = u51Var.d;
                f1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = f1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = f1Var.getChildAt(i12);
                    f1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && f1Var.getAdapter() == u51Var.e && (childAt instanceof org.telegram.ui.Cells.s3)) {
                            childAt = ((org.telegram.ui.Cells.s3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / f1Var.getMeasuredHeight()) * 100.0f);
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
