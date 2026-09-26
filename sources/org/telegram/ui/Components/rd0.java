package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
