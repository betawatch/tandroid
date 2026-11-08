package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.v10 c;

    public /* synthetic */ u11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.a = str;
        this.b = str2;
        this.c = v10Var;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        k21.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        k21.J0(this.a, "en", this.b, this.c);
    }
}
