package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
