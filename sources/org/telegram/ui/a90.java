package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;

    public /* synthetic */ a90(h90 h90Var, int i7) {
        this.a = i7;
        this.b = h90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h90 h90Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(h90Var.getParentActivity(), org.telegram.messenger.id.M0(2131746159, null));
                break;
            case 1:
                h90Var.r.d.requestFocus();
                org.telegram.messenger.g0.K3(h90Var.r.d);
                break;
            default:
                h90Var.r.d.clearFocus();
                org.telegram.messenger.g0.v1(h90Var.r.d);
                break;
        }
    }
}
