package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class a {
    public String a;
    public y25 b;
    public byte[] c;
    public final /* synthetic */ c d;

    public a(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        y25 y25Var = this.b;
        this.b = null;
        try {
            this.d.c0(y25Var, false, new u25(this, (byte) 0));
        } finally {
            y25Var.close();
        }
    }
}
