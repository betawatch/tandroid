package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                if (!fc0Var.Q && fc0Var.isAttachedToWindow() && fc0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fc0Var.b0, 0.0f);
                fc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new vb0(fc0Var, 1));
                ofFloat.addListener(new h60(fc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
                break;
        }
    }
}
