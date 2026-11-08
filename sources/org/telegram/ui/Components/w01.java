package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m11 b;

    public /* synthetic */ w01(m11 m11Var, int i7) {
        this.a = i7;
        this.b = m11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m11 m11Var = this.b;
                if (m11Var.l()) {
                    m11Var.m();
                    break;
                }
                break;
            default:
                m11 m11Var2 = this.b;
                b11 b11Var = m11Var2.J;
                b11Var.z1(true);
                z01 z01Var = m11Var2.y;
                z01Var.z1(true);
                m11Var2.M.a(true, true);
                org.telegram.messenger.g0.b4(z01Var);
                org.telegram.messenger.g0.b4(b11Var);
                break;
        }
    }
}
