package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class n0 implements c {
    public final /* synthetic */ h a;

    public n0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        com.google.android.gms.internal.cast.a0 a0Var = this.a.x;
        a0Var.sendMessage(a0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
