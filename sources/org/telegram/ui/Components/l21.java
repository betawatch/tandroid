package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.r10 c;

    public /* synthetic */ l21(String str, String str2, org.telegram.messenger.r10 r10Var) {
        this.a = str;
        this.b = str2;
        this.c = r10Var;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        b31.K0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.nc
    public void q(Exception exc) {
        b31.K0(this.a, "en", this.b, this.c);
    }
}
