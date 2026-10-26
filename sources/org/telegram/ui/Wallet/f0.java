package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
            this.d.S(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
