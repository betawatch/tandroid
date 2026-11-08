package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ z5(b6 b6Var, int i7) {
        this.a = i7;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                b6 b6Var = this.b;
                b6Var.h.invalidate();
                b6Var.n.invalidate();
                b6Var.e.invalidate();
                break;
        }
    }
}
