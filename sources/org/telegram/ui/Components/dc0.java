package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc0 b;

    public /* synthetic */ dc0(oc0 oc0Var, int i7) {
        this.a = i7;
        this.b = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        oc0 oc0Var = this.b;
        switch (i7) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = oc0Var.r;
                if (!oc0Var.Q && oc0Var.isAttachedToWindow() && oc0Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(oc0Var.b0, 0.0f);
                oc0Var.T = ofFloat;
                ofFloat.addUpdateListener(new ec0(oc0Var, 1));
                ofFloat.addListener(new p60(oc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(kr.h);
                ofFloat.start();
                break;
        }
    }
}
