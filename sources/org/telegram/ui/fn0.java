package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io0 b;

    public /* synthetic */ fn0(io0 io0Var, int i10) {
        this.a = i10;
        this.b = io0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                io0 io0Var = this.b;
                io0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(io0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                io0 io0Var2 = this.b;
                io0Var2.getMessagesController().newMessageCallback = null;
                if (io0Var2.f1 == 3 && !io0Var2.isFinishing()) {
                    io0Var2.f1 = 4;
                    ho0 ho0Var = io0Var2.Z0;
                    if (ho0Var != null) {
                        ho0Var.a(4);
                    }
                    io0Var2.finishFragment();
                    break;
                } else if (io0Var2.f1 == 1 && !io0Var2.isFinishing()) {
                    io0Var2.finishFragment();
                    break;
                }
                break;
            default:
                io0 io0Var3 = this.b;
                if (io0Var3.d0 != null) {
                    io0Var3.w0();
                    io0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
