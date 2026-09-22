package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ gd0(sd0 sd0Var, int i10) {
        this.a = i10;
        this.b = sd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        sd0 sd0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = sd0Var.r;
                if (sd0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                int i11 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(sd0Var.P, 0.0f);
                ofFloat.addUpdateListener(new hd0(sd0Var, i11));
                ofFloat.addListener(new jd0(sd0Var, i11));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                break;
        }
    }
}
