package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae0 b;

    public /* synthetic */ pd0(ae0 ae0Var, int i10) {
        this.a = i10;
        this.b = ae0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ae0 ae0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ae0Var.r;
                if (ae0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ae0Var.P, 0.0f);
                ofFloat.addUpdateListener(new qd0(ae0Var, 0));
                ofFloat.addListener(new dd0(ae0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                break;
        }
    }
}
