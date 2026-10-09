package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ ie0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        te0 te0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = te0Var.r;
                if (!te0Var.L && te0Var.isAttachedToWindow() && te0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(te0Var.T, 0.0f);
                te0Var.O = ofFloat;
                ofFloat.addUpdateListener(new je0(te0Var, 0));
                ofFloat.addListener(new vd0(te0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(hs.h);
                ofFloat.start();
                break;
        }
    }
}
