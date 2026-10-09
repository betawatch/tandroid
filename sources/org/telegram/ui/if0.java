package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf0 b;

    public /* synthetic */ if0(kf0 kf0Var, int i10) {
        this.a = i10;
        this.b = kf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kf0 kf0Var = this.b;
                org.telegram.ui.Components.fk0 fk0Var = kf0Var.h;
                fk0Var.getAnimatedDrawable().N(0, false, false);
                fk0Var.d();
                EditTextBoldCursor editTextBoldCursor = kf0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
