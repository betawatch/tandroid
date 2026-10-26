package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ zd0(le0 le0Var, int i10) {
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
                ofFloat.addUpdateListener(new ae0(le0Var, 1));
                ofFloat.addListener(new i10(le0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(ds.h);
                ofFloat.start();
                break;
        }
    }
}
