package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef0 b;

    public /* synthetic */ cf0(ef0 ef0Var, int i10) {
        this.a = i10;
        this.b = ef0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ef0 ef0Var = this.b;
                org.telegram.ui.Components.kj0 kj0Var = ef0Var.h;
                kj0Var.getAnimatedDrawable().L(0, false, false);
                kj0Var.d();
                EditTextBoldCursor editTextBoldCursor = ef0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
