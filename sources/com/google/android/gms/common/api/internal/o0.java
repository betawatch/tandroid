package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
