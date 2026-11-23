package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class y0 extends u {
    public final /* synthetic */ t d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(t tVar, n6.c[] cVarArr, boolean z10, int i7) {
        super(cVarArr, z10, i7);
        this.d = tVar;
    }

    @Override // com.google.android.gms.common.api.internal.u
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((q) this.d.c).accept(cVar, taskCompletionSource);
    }
}
