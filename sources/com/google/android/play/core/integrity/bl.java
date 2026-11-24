package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final s2d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new s2d("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, h2d
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        ap a = kVar.a(bundle);
        TaskCompletionSource taskCompletionSource = this.a;
        if (a != null) {
            taskCompletionSource.trySetException(a);
        } else {
            taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
