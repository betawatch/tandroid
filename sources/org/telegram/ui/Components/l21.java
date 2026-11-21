package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements org.telegram.messenger.nc, org.telegram.messenger.mc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.q10 c;

    public /* synthetic */ l21(String str, String str2, org.telegram.messenger.q10 q10Var) {
        this.a = str;
        this.b = str2;
        this.c = q10Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        b31.K0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        b31.K0(this.a, "en", this.b, this.c);
    }
}
