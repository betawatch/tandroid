package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x0 extends t {
    public final /* synthetic */ s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s sVar, m6.c[] cVarArr, boolean z10, int i3) {
        super(cVarArr, z10, i3);
        this.d = sVar;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((p) this.d.c).accept(cVar, taskCompletionSource);
    }
}
