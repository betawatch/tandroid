package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e1 extends w {
    public final /* synthetic */ v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(v vVar, k6.c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.d = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((s) this.d.c).accept(cVar, taskCompletionSource);
    }
}
