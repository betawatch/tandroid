package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ ob0(zb0 zb0Var, int i3) {
        this.a = i3;
        this.b = zb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        zb0 zb0Var = this.b;
        switch (i3) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = zb0Var.r;
                if (!zb0Var.Q && zb0Var.isAttachedToWindow() && zb0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zb0Var.b0, 0.0f);
                zb0Var.T = ofFloat;
                ofFloat.addUpdateListener(new pb0(zb0Var, 1));
                ofFloat.addListener(new a60(zb0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                break;
        }
    }
}
