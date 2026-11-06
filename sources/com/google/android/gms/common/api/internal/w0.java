package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class w0 extends t {
    public final /* synthetic */ s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(s sVar, n6.c[] cVarArr, boolean z9, int i7) {
        super(cVarArr, z9, i7);
        this.d = sVar;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((p) this.d.c).accept(cVar, taskCompletionSource);
    }
}
