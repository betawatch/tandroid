package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
