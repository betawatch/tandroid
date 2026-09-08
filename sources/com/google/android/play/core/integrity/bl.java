package com.google.android.play.core.integrity;

import a9.i0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final i0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new i0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, a9.a0
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        com.google.android.gms.common.api.f a2 = kVar.a(bundle);
        if (a2 != null) {
            this.a.trySetException(a2);
        } else {
            this.a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
