package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
