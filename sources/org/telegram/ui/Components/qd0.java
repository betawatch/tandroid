package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be0 b;

    public /* synthetic */ qd0(be0 be0Var, int i10) {
        this.a = i10;
        this.b = be0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        be0 be0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = be0Var.r;
                if (be0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(be0Var.P, 0.0f);
                ofFloat.addUpdateListener(new rd0(be0Var, 0));
                ofFloat.addListener(new ed0(be0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                break;
        }
    }
}
