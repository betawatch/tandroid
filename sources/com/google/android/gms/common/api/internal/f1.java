package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
