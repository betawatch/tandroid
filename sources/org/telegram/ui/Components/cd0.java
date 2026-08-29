package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;

    public /* synthetic */ cd0(nd0 nd0Var, int i10) {
        this.a = i10;
        this.b = nd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        nd0 nd0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = nd0Var.r;
                if (nd0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nd0Var.L, 0.0f);
                ofFloat.addUpdateListener(new dd0(nd0Var, 0));
                ofFloat.addListener(new zz(nd0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(jr.h);
                ofFloat.start();
                break;
        }
    }
}
