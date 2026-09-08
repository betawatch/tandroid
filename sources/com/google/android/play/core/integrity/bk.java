package com.google.android.play.core.integrity;

import a9.i0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final i0 d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j3) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new i0("OnRequestIntegrityTokenCallback");
        this.e = j3;
    }

    @Override // com.google.android.play.core.integrity.bi, a9.a0
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
