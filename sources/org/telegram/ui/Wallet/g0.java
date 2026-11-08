package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class g0 {
    public String a;
    public j0 b;
    public byte[] c;
    public final /* synthetic */ m0 d;

    public g0(m0 m0Var) {
        this.d = m0Var;
    }

    public final void a() {
        j0 j0Var = this.b;
        this.b = null;
        try {
            this.d.U(j0Var, false, new f0(this, 0));
        } finally {
            j0Var.close();
        }
    }
}
