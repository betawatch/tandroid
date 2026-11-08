package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public /* synthetic */ ik0(hl0 hl0Var, int i7) {
        this.a = i7;
        this.b = hl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                hl0 hl0Var = this.b;
                hl0Var.getMessagesController().l7 = null;
                if (hl0Var.f1 == 3 && !hl0Var.isFinishing()) {
                    hl0Var.f1 = 4;
                    gl0 gl0Var = hl0Var.Z0;
                    if (gl0Var != null) {
                        gl0Var.b(4);
                    }
                    hl0Var.finishFragment();
                    break;
                } else if (hl0Var.f1 == 1 && !hl0Var.isFinishing()) {
                    hl0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                hl0 hl0Var2 = this.b;
                if (hl0Var2.d0 != null) {
                    hl0Var2.C0();
                    hl0Var2.d0 = null;
                    break;
                }
                break;
            default:
                hl0 hl0Var3 = this.b;
                hl0Var3.f[0].requestFocus();
                org.telegram.messenger.g0.K3(hl0Var3.f[0]);
                break;
        }
    }
}
