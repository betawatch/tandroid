package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
class bi extends x4d {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // x4d
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // x4d
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // x4d
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // x4d
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
