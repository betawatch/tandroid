package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ dd0(pe0 pe0Var, int i10) {
        this.a = i10;
        this.b = pe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H.n();
                break;
            case 1:
                pe0 pe0Var = this.b;
                pe0Var.I = null;
                pe0Var.J = null;
                pe0Var.p(true);
                pe0Var.e.h(null, null, pe0Var.f, null);
                ed edVar = pe0Var.n;
                org.telegram.ui.Components.xi0 xi0Var = pe0Var.E;
                edVar.setAnimation(xi0Var);
                xi0Var.K(0);
                pe0Var.G = true;
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
