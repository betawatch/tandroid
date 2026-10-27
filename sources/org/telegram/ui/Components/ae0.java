package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ae0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        me0 me0Var = this.b;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = me0Var.r;
                if (!me0Var.P && me0Var.isAttachedToWindow() && me0Var.x.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(me0Var.a0, 0.0f);
                me0Var.S = ofFloat;
                ofFloat.addUpdateListener(new be0(me0Var, 1));
                ofFloat.addListener(new i10(me0Var, 8));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(ds.h);
                ofFloat.start();
                break;
        }
    }
}
