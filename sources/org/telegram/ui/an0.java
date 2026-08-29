package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo0 b;

    public /* synthetic */ an0(bo0 bo0Var, int i10) {
        this.a = i10;
        this.b = bo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo0 bo0Var = this.b;
                bo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(bo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                bo0 bo0Var2 = this.b;
                bo0Var2.getMessagesController().newMessageCallback = null;
                if (bo0Var2.b1 == 3 && !bo0Var2.isFinishing()) {
                    bo0Var2.b1 = 4;
                    ao0 ao0Var = bo0Var2.V0;
                    if (ao0Var != null) {
                        ao0Var.a(4);
                    }
                    bo0Var2.finishFragment();
                    break;
                } else if (bo0Var2.b1 == 1 && !bo0Var2.isFinishing()) {
                    bo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                bo0 bo0Var3 = this.b;
                if (bo0Var3.Z != null) {
                    bo0Var3.w0();
                    bo0Var3.Z = null;
                    break;
                }
                break;
        }
    }
}
