package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ kd0(xd0 xd0Var, int i10) {
        this.a = i10;
        this.b = xd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        xd0 xd0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = xd0Var.r;
                if (xd0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(xd0Var.M, 0.0f);
                ofFloat.addUpdateListener(new ld0(xd0Var, 0));
                ofFloat.addListener(new a9(xd0Var, 29));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
                break;
        }
    }
}
