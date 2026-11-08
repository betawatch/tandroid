package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
