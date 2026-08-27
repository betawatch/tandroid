package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ sc0(dd0 dd0Var, int i10) {
        this.a = i10;
        this.b = dd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        dd0 dd0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = dd0Var.r;
                if (dd0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(dd0Var.L, 0.0f);
                ofFloat.addUpdateListener(new tc0(dd0Var, 0));
                ofFloat.addListener(new sz(dd0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(er.h);
                ofFloat.start();
                break;
        }
    }
}
