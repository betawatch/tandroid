package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ pe0(re0 re0Var, int i10) {
        this.a = i10;
        this.b = re0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                re0 re0Var = this.b;
                org.telegram.ui.Components.xj0 xj0Var = re0Var.h;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                EditTextBoldCursor editTextBoldCursor = re0Var.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.b.b.requestFocus();
                break;
        }
    }
}
