package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
            this.d.S(j0Var, false, new f0(this, 0));
        } finally {
            j0Var.close();
        }
    }
}
