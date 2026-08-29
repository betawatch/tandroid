package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o0 implements c {
    public final /* synthetic */ h a;

    public o0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        c2.v0 v0Var = this.a.x;
        v0Var.sendMessage(v0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
