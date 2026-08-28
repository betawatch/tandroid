package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
class bi extends k8.x {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // k8.y
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // k8.y
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // k8.y
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // k8.y
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
