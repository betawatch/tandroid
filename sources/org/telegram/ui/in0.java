package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo0 b;

    public /* synthetic */ in0(jo0 jo0Var, int i10) {
        this.a = i10;
        this.b = jo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jo0 jo0Var = this.b;
                jo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(jo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                jo0 jo0Var2 = this.b;
                jo0Var2.getMessagesController().newMessageCallback = null;
                if (jo0Var2.c1 == 3 && !jo0Var2.isFinishing()) {
                    jo0Var2.c1 = 4;
                    io0 io0Var = jo0Var2.W0;
                    if (io0Var != null) {
                        io0Var.a(4);
                    }
                    jo0Var2.finishFragment();
                    break;
                } else if (jo0Var2.c1 == 1 && !jo0Var2.isFinishing()) {
                    jo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                jo0 jo0Var3 = this.b;
                if (jo0Var3.a0 != null) {
                    jo0Var3.w0();
                    jo0Var3.a0 = null;
                    break;
                }
                break;
        }
    }
}
