package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 implements c {
    public final /* synthetic */ h a;

    public o0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        c2.t0 t0Var = this.a.x;
        t0Var.sendMessage(t0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
