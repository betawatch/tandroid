package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class o0 implements c {
    public final /* synthetic */ h a;

    public o0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        com.google.android.gms.internal.cast.c0 c0Var = this.a.x;
        c0Var.sendMessage(c0Var.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
