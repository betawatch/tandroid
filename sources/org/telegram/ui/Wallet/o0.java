package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o0 {
    public String a;
    public s0 b;
    public byte[] c;
    public final /* synthetic */ v0 d;

    public o0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        s0 s0Var = this.b;
        this.b = null;
        try {
            this.d.d0(s0Var, false, new n0(this, 0));
        } finally {
            s0Var.close();
        }
    }
}
