package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.c0;
import d9.g0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
final class ai extends c0 {
    final /* synthetic */ aj a;
    private final g0 b;
    private final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.a = ajVar;
        this.b = new g0("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // d9.d0
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.a.a.d(this.c);
        this.b.b("onRequestIntegrityToken", new Object[0]);
        kVar = this.a.f;
        com.google.android.gms.common.api.f a10 = kVar.a(bundle);
        if (a10 != null) {
            this.c.trySetException(a10);
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
