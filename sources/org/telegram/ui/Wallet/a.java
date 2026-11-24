package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class a {
    public String a;
    public y05 b;
    public byte[] c;
    public final /* synthetic */ c d;

    public a(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        y05 y05Var = this.b;
        this.b = null;
        try {
            this.d.c0(y05Var, false, new u05(this, (byte) 0));
        } finally {
            y05Var.close();
        }
    }
}
