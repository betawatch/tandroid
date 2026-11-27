package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class a {
    public String a;
    public c35 b;
    public byte[] c;
    public final /* synthetic */ c d;

    public a(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        c35 c35Var = this.b;
        this.b = null;
        try {
            this.d.e0(c35Var, false, new y25(this, (byte) 0));
        } finally {
            c35Var.close();
        }
    }
}
