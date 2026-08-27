package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ fd0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H.n();
                break;
            case 1:
                te0 te0Var = this.b;
                te0Var.I = null;
                te0Var.J = null;
                te0Var.p(true);
                te0Var.e.h(null, null, te0Var.f, null);
                fd fdVar = te0Var.n;
                org.telegram.ui.Components.oi0 oi0Var = te0Var.E;
                fdVar.setAnimation(oi0Var);
                oi0Var.K(0);
                te0Var.G = true;
                break;
            case 2:
                this.b.G = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
