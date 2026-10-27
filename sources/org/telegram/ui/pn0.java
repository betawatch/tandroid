package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;

    public /* synthetic */ pn0(ro0 ro0Var, int i10) {
        this.a = i10;
        this.b = ro0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ro0 ro0Var = this.b;
                ro0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(ro0Var.f[0]);
                break;
            case 1:
                this.b.u0();
                break;
            case 2:
                ro0 ro0Var2 = this.b;
                ro0Var2.getMessagesController().newMessageCallback = null;
                if (ro0Var2.f1 == 3 && !ro0Var2.isFinishing()) {
                    ro0Var2.f1 = 4;
                    qo0 qo0Var = ro0Var2.Z0;
                    if (qo0Var != null) {
                        qo0Var.a(4);
                    }
                    ro0Var2.finishFragment();
                    break;
                } else if (ro0Var2.f1 == 1 && !ro0Var2.isFinishing()) {
                    ro0Var2.finishFragment();
                    break;
                }
                break;
            default:
                ro0 ro0Var3 = this.b;
                if (ro0Var3.d0 != null) {
                    ro0Var3.x0();
                    ro0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
