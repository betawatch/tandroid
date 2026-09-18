package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
