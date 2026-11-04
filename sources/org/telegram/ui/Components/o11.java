package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements org.telegram.messenger.jc, org.telegram.messenger.ic {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.n10 c;

    public /* synthetic */ o11(String str, String str2, org.telegram.messenger.n10 n10Var) {
        this.a = str;
        this.b = str2;
        this.c = n10Var;
    }

    @Override // org.telegram.messenger.jc
    public void a(String str) {
        f21.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        f21.J0(this.a, "en", this.b, this.c);
    }
}
