package com.google.android.play.core.integrity;

import a9.a0;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
