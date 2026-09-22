package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                org.telegram.ui.Components.nj0 nj0Var = nf0Var.h;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
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
