package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final s2d d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new s2d("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, h2d
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.d.b("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        ap a = kVar.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.c.c;
        bj bjVar = new bj(this, str, j);
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
