package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class n0 {
    public String a;
    public r0 b;
    public byte[] c;
    public final /* synthetic */ u0 d;

    public n0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        r0 r0Var = this.b;
        this.b = null;
        try {
            this.d.d0(r0Var, false, new m0(this, 0));
        } finally {
            r0Var.close();
        }
    }
}
