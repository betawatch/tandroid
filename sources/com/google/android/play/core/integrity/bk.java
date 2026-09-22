package com.google.android.play.core.integrity;

import a9.j0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final j0 d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j3) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new j0("OnRequestIntegrityTokenCallback");
        this.e = j3;
    }

    @Override // com.google.android.play.core.integrity.bi, a9.b0
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
        long j3 = bundle.getLong("request.token.sid");
        str = this.c.c;
        bj bjVar = new bj(this, str, j3);
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
