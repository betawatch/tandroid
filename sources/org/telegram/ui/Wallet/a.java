package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
