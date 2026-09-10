package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
