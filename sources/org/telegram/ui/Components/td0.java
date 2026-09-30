package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ td0(ee0 ee0Var, int i10) {
        this.a = i10;
        this.b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ee0 ee0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ee0Var.r;
                if (ee0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ee0Var.P, 0.0f);
                ofFloat.addUpdateListener(new ud0(ee0Var, 0));
                ofFloat.addListener(new hd0(ee0Var, 1));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(sr.h);
                ofFloat.start();
                break;
        }
    }
}
