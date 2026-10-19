package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;

    public /* synthetic */ an0(eo0 eo0Var, int i10) {
        this.a = i10;
        this.b = eo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo0 eo0Var = this.b;
                eo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(eo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                eo0 eo0Var2 = this.b;
                eo0Var2.getMessagesController().newMessageCallback = null;
                if (eo0Var2.f1 == 3 && !eo0Var2.isFinishing()) {
                    eo0Var2.f1 = 4;
                    do0 do0Var = eo0Var2.Z0;
                    if (do0Var != null) {
                        do0Var.c(4);
                    }
                    eo0Var2.finishFragment();
                    break;
                } else if (eo0Var2.f1 == 1 && !eo0Var2.isFinishing()) {
                    eo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                eo0 eo0Var3 = this.b;
                if (eo0Var3.d0 != null) {
                    eo0Var3.w0();
                    eo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
