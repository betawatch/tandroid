package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import k8.g0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final g0 d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new g0("OnRequestIntegrityTokenCallback");
        this.e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, k8.y
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.d.b("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        com.google.android.gms.common.api.f a2 = kVar.a(bundle);
        if (a2 != null) {
            this.a.trySetException(a2);
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.c.c;
        bj bjVar = new bj(this, str, j10);
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
