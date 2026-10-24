package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
