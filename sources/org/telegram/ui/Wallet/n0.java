package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
