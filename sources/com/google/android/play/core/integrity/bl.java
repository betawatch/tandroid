package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final h5d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new h5d("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, x4d
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        ao a = kVar.a(bundle);
        TaskCompletionSource taskCompletionSource = this.a;
        if (a != null) {
            taskCompletionSource.trySetException(a);
        } else {
            taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
