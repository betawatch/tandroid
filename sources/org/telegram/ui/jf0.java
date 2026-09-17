package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ jf0(lf0 lf0Var, int i10) {
        this.a = i10;
        this.b = lf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lf0 lf0Var = this.b;
                org.telegram.ui.Components.aj0 aj0Var = lf0Var.h;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                EditTextBoldCursor editTextBoldCursor = lf0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
