package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final q0d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new q0d("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, g0d
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        zn a = kVar.a(bundle);
        TaskCompletionSource taskCompletionSource = this.a;
        if (a != null) {
            taskCompletionSource.trySetException(a);
        } else {
            taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
