package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny0 b;

    public /* synthetic */ ky0(ny0 ny0Var, int i7) {
        this.a = i7;
        this.b = ny0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ny0 ny0Var = this.b;
                oy0 oy0Var = ny0Var.w;
                if (ny0Var.a != 0) {
                    oy0Var.onBackPressed();
                    break;
                } else {
                    oy0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.K3(this.b.n.d);
                break;
        }
    }
}
