package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ so0 b;

    public /* synthetic */ pn0(so0 so0Var, int i10) {
        this.a = i10;
        this.b = so0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                so0 so0Var = this.b;
                so0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(so0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                so0 so0Var2 = this.b;
                so0Var2.getMessagesController().newMessageCallback = null;
                if (so0Var2.f1 == 3 && !so0Var2.isFinishing()) {
                    so0Var2.f1 = 4;
                    ro0 ro0Var = so0Var2.Z0;
                    if (ro0Var != null) {
                        ro0Var.a(4);
                    }
                    so0Var2.finishFragment();
                    break;
                } else if (so0Var2.f1 == 1 && !so0Var2.isFinishing()) {
                    so0Var2.finishFragment();
                    break;
                }
                break;
            default:
                so0 so0Var3 = this.b;
                if (so0Var3.d0 != null) {
                    so0Var3.w0();
                    so0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
