package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
