package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc0 b;

    public /* synthetic */ mc0(zc0 zc0Var, int i10) {
        this.a = i10;
        this.b = zc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        zc0 zc0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = zc0Var.r;
                if (!zc0Var.P && zc0Var.isAttachedToWindow() && zc0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zc0Var.a0, 0.0f);
                zc0Var.S = ofFloat;
                ofFloat.addUpdateListener(new nc0(zc0Var, 1));
                ofFloat.addListener(new t60(zc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
                break;
        }
    }
}
