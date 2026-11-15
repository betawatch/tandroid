package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z11 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.s10 c;

    public /* synthetic */ z11(String str, String str2, org.telegram.messenger.s10 s10Var) {
        this.a = str;
        this.b = str2;
        this.c = s10Var;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        p21.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        p21.J0(this.a, "en", this.b, this.c);
    }
}
