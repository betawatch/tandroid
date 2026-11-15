package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class f0 {
    public String a;
    public i0 b;
    public byte[] c;
    public final /* synthetic */ l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.b;
        this.b = null;
        try {
            this.d.U(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
