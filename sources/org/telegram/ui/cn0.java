package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo0 b;

    public /* synthetic */ cn0(fo0 fo0Var, int i10) {
        this.a = i10;
        this.b = fo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo0 fo0Var = this.b;
                fo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(fo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                fo0 fo0Var2 = this.b;
                fo0Var2.getMessagesController().newMessageCallback = null;
                if (fo0Var2.f1 == 3 && !fo0Var2.isFinishing()) {
                    fo0Var2.f1 = 4;
                    eo0 eo0Var = fo0Var2.Z0;
                    if (eo0Var != null) {
                        eo0Var.c(4);
                    }
                    fo0Var2.finishFragment();
                    break;
                } else if (fo0Var2.f1 == 1 && !fo0Var2.isFinishing()) {
                    fo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                fo0 fo0Var3 = this.b;
                if (fo0Var3.d0 != null) {
                    fo0Var3.w0();
                    fo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
