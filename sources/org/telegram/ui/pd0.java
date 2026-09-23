package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;

    public /* synthetic */ pd0(cf0 cf0Var, int i10) {
        this.a = i10;
        this.b = cf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.n();
                break;
            case 1:
                cf0 cf0Var = this.b;
                cf0Var.M = null;
                cf0Var.N = null;
                cf0Var.p(true);
                cf0Var.e.h(null, null, cf0Var.f, null);
                id idVar = cf0Var.n;
                org.telegram.ui.Components.yi0 yi0Var = cf0Var.I;
                idVar.setAnimation(yi0Var);
                yi0Var.M(0);
                cf0Var.K = true;
                break;
            case 2:
                this.b.K = true;
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
