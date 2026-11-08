package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
