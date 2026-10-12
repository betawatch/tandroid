package com.google.android.play.core.integrity;

import a9.a0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
