package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ pl0(qm0 qm0Var, int i10) {
        this.a = i10;
        this.b = qm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                qm0 qm0Var = this.b;
                qm0Var.getMessagesController().m7 = null;
                if (qm0Var.f1 == 3 && !qm0Var.isFinishing()) {
                    qm0Var.f1 = 4;
                    pm0 pm0Var = qm0Var.Z0;
                    if (pm0Var != null) {
                        pm0Var.e(4);
                    }
                    qm0Var.finishFragment();
                    break;
                } else if (qm0Var.f1 == 1 && !qm0Var.isFinishing()) {
                    qm0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                qm0 qm0Var2 = this.b;
                if (qm0Var2.d0 != null) {
                    qm0Var2.C0();
                    qm0Var2.d0 = null;
                    break;
                }
                break;
            default:
                qm0 qm0Var3 = this.b;
                qm0Var3.f[0].requestFocus();
                org.telegram.messenger.i0.J3(qm0Var3.f[0]);
                break;
        }
    }
}
