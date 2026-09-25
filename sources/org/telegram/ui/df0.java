package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ df0(ff0 ff0Var, int i10) {
        this.a = i10;
        this.b = ff0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                org.telegram.ui.Components.lj0 lj0Var = ff0Var.h;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ff0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
