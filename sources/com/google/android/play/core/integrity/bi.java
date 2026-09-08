package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
class bi extends a9.z {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // a9.a0
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // a9.a0
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // a9.a0
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // a9.a0
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
