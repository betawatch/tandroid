package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
