package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements org.telegram.messenger.nc, org.telegram.messenger.mc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.q10 c;

    public /* synthetic */ i21(String str, String str2, org.telegram.messenger.q10 q10Var) {
        this.a = str;
        this.b = str2;
        this.c = q10Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        y21.K0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        y21.K0(this.a, "en", this.b, this.c);
    }
}
