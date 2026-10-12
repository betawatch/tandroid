package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ ge0(re0 re0Var, int i10) {
        this.a = i10;
        this.b = re0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        re0 re0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = re0Var.r;
                if (!re0Var.L && re0Var.isAttachedToWindow() && re0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(re0Var.T, 0.0f);
                re0Var.O = ofFloat;
                ofFloat.addUpdateListener(new he0(re0Var, 0));
                ofFloat.addListener(new k90(re0Var, 4));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(es.h);
                ofFloat.start();
                break;
        }
    }
}
