package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f1 extends w {
    public final /* synthetic */ v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(v vVar, y5.c[] cVarArr, boolean z4, int i10) {
        super(cVarArr, z4, i10);
        this.d = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((s) this.d.c).accept(cVar, taskCompletionSource);
    }
}
