package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ sd0(de0 de0Var, int i10) {
        this.a = i10;
        this.b = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        de0 de0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = de0Var.r;
                if (de0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(de0Var.P, 0.0f);
                ofFloat.addUpdateListener(new td0(de0Var, 0));
                ofFloat.addListener(new gd0(de0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(qr.h);
                ofFloat.start();
                break;
        }
    }
}
