package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.v10 c;

    public /* synthetic */ v11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.a = str;
        this.b = str2;
        this.c = v10Var;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        l21.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        l21.J0(this.a, "en", this.b, this.c);
    }
}
