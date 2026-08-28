package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc0 b;

    public /* synthetic */ nc0(yc0 yc0Var, int i9) {
        this.a = i9;
        this.b = yc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        yc0 yc0Var = this.b;
        switch (i9) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = yc0Var.r;
                if (yc0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(yc0Var.L, 0.0f);
                ofFloat.addUpdateListener(new oc0(yc0Var, 0));
                ofFloat.addListener(new r60(yc0Var, 6));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
                break;
        }
    }
}
