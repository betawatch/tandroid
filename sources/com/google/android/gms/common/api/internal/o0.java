package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 implements c {
    public final /* synthetic */ h a;

    public o0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        c2.u0 u0Var = this.a.x;
        u0Var.sendMessage(u0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
