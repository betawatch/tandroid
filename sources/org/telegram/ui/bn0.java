package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;

    public /* synthetic */ bn0(co0 co0Var, int i9) {
        this.a = i9;
        this.b = co0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co0 co0Var = this.b;
                co0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(co0Var.f[0]);
                break;
            case 1:
                this.b.s0();
                break;
            case 2:
                co0 co0Var2 = this.b;
                co0Var2.getMessagesController().newMessageCallback = null;
                if (co0Var2.b1 == 3 && !co0Var2.isFinishing()) {
                    co0Var2.b1 = 4;
                    bo0 bo0Var = co0Var2.V0;
                    if (bo0Var != null) {
                        bo0Var.b(4);
                    }
                    co0Var2.finishFragment();
                    break;
                } else if (co0Var2.b1 == 1 && !co0Var2.isFinishing()) {
                    co0Var2.finishFragment();
                    break;
                }
                break;
            default:
                co0 co0Var3 = this.b;
                if (co0Var3.Z != null) {
                    co0Var3.v0();
                    co0Var3.Z = null;
                    break;
                }
                break;
        }
    }
}
