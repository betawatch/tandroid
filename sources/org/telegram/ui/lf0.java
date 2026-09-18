package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf0 b;

    public /* synthetic */ lf0(nf0 nf0Var, int i10) {
        this.a = i10;
        this.b = nf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nf0 nf0Var = this.b;
                org.telegram.ui.Components.bj0 bj0Var = nf0Var.h;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                EditTextBoldCursor editTextBoldCursor = nf0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
