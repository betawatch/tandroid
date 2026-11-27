package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
