package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
