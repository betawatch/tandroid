package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe0 b;

    public /* synthetic */ bd0(qe0 qe0Var, int i9) {
        this.a = i9;
        this.b = qe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H.n();
                break;
            case 1:
                qe0 qe0Var = this.b;
                qe0Var.I = null;
                qe0Var.J = null;
                qe0Var.p(true);
                qe0Var.e.h(null, null, qe0Var.f, null);
                fd fdVar = qe0Var.n;
                org.telegram.ui.Components.mi0 mi0Var = qe0Var.E;
                fdVar.setAnimation(mi0Var);
                mi0Var.K(0);
                qe0Var.G = true;
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
