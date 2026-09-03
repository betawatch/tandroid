package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd0 b;

    public /* synthetic */ jd0(wd0 wd0Var, int i10) {
        this.a = i10;
        this.b = wd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wd0 wd0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = wd0Var.r;
                if (wd0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(wd0Var.M, 0.0f);
                ofFloat.addUpdateListener(new kd0(wd0Var, 0));
                ofFloat.addListener(new a9(wd0Var, 29));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(mr.h);
                ofFloat.start();
                break;
        }
    }
}
