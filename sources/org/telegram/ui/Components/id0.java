package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd0 b;

    public /* synthetic */ id0(vd0 vd0Var, int i10) {
        this.a = i10;
        this.b = vd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vd0 vd0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = vd0Var.r;
                if (vd0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(vd0Var.M, 0.0f);
                ofFloat.addUpdateListener(new jd0(vd0Var, 0));
                ofFloat.addListener(new a9(vd0Var, 29));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
                ofFloat.start();
                break;
        }
    }
}
