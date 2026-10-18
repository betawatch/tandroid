package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ ae0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        le0 le0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = le0Var.r;
                if (!le0Var.P && le0Var.isAttachedToWindow() && le0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(le0Var.a0, 0.0f);
                le0Var.S = ofFloat;
                ofFloat.addUpdateListener(new be0(le0Var, 1));
                ofFloat.addListener(new c80(le0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(bs.h);
                ofFloat.start();
                break;
        }
    }
}
