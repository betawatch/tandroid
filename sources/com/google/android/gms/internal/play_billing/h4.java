package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h4 extends f4 {
    public final /* synthetic */ i4 n;

    public h4(i4 i4Var) {
        this.n = i4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final String b() {
        g4 g4Var = (g4) this.n.a.get();
        return g4Var == null ? "Completer object has been garbage collected, future will fail soon" : a9.p.m("tag=[", String.valueOf(g4Var.a), "]");
    }
}
