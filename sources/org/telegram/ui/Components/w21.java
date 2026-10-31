package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements org.telegram.messenger.qc, org.telegram.messenger.pc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.j20 c;

    public /* synthetic */ w21(String str, String str2, org.telegram.messenger.j20 j20Var) {
        this.a = str;
        this.b = str2;
        this.c = j20Var;
    }

    @Override // org.telegram.messenger.qc
    public void a(String str) {
        m31.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        m31.J0(this.a, "en", this.b, this.c);
    }
}
