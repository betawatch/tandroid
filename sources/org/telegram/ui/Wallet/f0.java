package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
