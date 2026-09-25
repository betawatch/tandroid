package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;

    public /* synthetic */ rd0(ce0 ce0Var, int i10) {
        this.a = i10;
        this.b = ce0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ce0 ce0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ce0Var.r;
                if (ce0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ce0Var.P, 0.0f);
                ofFloat.addUpdateListener(new sd0(ce0Var, 0));
                ofFloat.addListener(new fd0(ce0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(rr.h);
                ofFloat.start();
                break;
        }
    }
}
