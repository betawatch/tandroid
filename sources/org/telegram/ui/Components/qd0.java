package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
