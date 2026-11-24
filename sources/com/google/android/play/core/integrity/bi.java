package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class bi extends h2d {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // h2d
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // h2d
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // h2d
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // h2d
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
