package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
