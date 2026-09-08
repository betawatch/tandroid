package com.google.android.play.core.integrity;

import a9.e0;
import a9.i0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class ai extends e0 {
    final /* synthetic */ aj a;
    private final i0 b;
    private final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.a = ajVar;
        this.b = new i0("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // a9.f0
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.a.a.d(this.c);
        this.b.b("onRequestIntegrityToken", new Object[0]);
        kVar = this.a.f;
        com.google.android.gms.common.api.f a2 = kVar.a(bundle);
        if (a2 != null) {
            this.c.trySetException(a2);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j3 = bundle.getLong("request.token.sid");
        str = this.a.c;
        ah ahVar = new ah(this, str, j3);
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
