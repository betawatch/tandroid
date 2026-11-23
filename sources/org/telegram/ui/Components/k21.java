package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k21 implements org.telegram.messenger.nc, org.telegram.messenger.mc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.p10 c;

    public /* synthetic */ k21(String str, String str2, org.telegram.messenger.p10 p10Var) {
        this.a = str;
        this.b = str2;
        this.c = p10Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        a31.K0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.mc
    public void s(Exception exc) {
        a31.K0(this.a, "en", this.b, this.c);
    }
}
