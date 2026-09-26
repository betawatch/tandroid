package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
