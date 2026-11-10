package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;

    public /* synthetic */ eb0(sc0 sc0Var, int i7) {
        this.a = i7;
        this.b = sc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.M.m();
                break;
            case 1:
                sc0 sc0Var = this.b;
                sc0Var.N = null;
                sc0Var.O = null;
                sc0Var.o(true);
                sc0Var.e.j(null, null, sc0Var.f, null);
                yc ycVar = sc0Var.n;
                org.telegram.ui.Components.zg0 zg0Var = sc0Var.J;
                ycVar.setAnimation(zg0Var);
                zg0Var.M(0);
                sc0Var.L = true;
                break;
            case 2:
                this.b.L = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
