package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc0 b;

    public /* synthetic */ fc0(qc0 qc0Var, int i7) {
        this.a = i7;
        this.b = qc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qc0 qc0Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = qc0Var.r;
                if (!qc0Var.Q && qc0Var.isAttachedToWindow() && qc0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qc0Var.b0, 0.0f);
                qc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new gc0(qc0Var, 1));
                ofFloat.addListener(new s60(qc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
                break;
        }
    }
}
