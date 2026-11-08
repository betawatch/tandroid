package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
