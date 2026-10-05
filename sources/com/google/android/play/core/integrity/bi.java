package com.google.android.play.core.integrity;

import a9.a0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
class bi extends a0 {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // a9.b0
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // a9.b0
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // a9.b0
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // a9.b0
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
