package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec0 b;

    public /* synthetic */ tb0(ec0 ec0Var, int i7) {
        this.a = i7;
        this.b = ec0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ec0 ec0Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ec0Var.r;
                if (!ec0Var.P && ec0Var.isAttachedToWindow() && ec0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ec0Var.a0, 0.0f);
                ec0Var.S = ofFloat;
                ofFloat.addUpdateListener(new ub0(ec0Var, 1));
                ofFloat.addListener(new e60(ec0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wq.h);
                ofFloat.start();
                break;
        }
    }
}
