package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d1 extends v {
    public final /* synthetic */ u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(u uVar, k6.c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.d = uVar;
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((r) this.d.c).accept(cVar, taskCompletionSource);
    }
}
