package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc0 b;

    public /* synthetic */ ub0(fc0 fc0Var, int i7) {
        this.a = i7;
        this.b = fc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fc0 fc0Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = fc0Var.r;
                if (!fc0Var.P && fc0Var.isAttachedToWindow() && fc0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fc0Var.a0, 0.0f);
                fc0Var.S = ofFloat;
                ofFloat.addUpdateListener(new vb0(fc0Var, 1));
                ofFloat.addListener(new f60(fc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
                ofFloat.start();
                break;
        }
    }
}
