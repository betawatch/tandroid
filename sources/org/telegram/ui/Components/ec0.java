package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ ec0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        pc0 pc0Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = pc0Var.r;
                if (!pc0Var.Q && pc0Var.isAttachedToWindow() && pc0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pc0Var.b0, 0.0f);
                pc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new fc0(pc0Var, 1));
                ofFloat.addListener(new q60(pc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(lr.h);
                ofFloat.start();
                break;
        }
    }
}
