package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ hd0(sd0 sd0Var, int i10) {
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
                ValueAnimator ofFloat = ValueAnimator.ofFloat(sd0Var.P, 0.0f);
                ofFloat.addUpdateListener(new id0(sd0Var, 0));
                ofFloat.addListener(new r80(sd0Var, 3));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(pr.h);
                ofFloat.start();
                break;
        }
    }
}
