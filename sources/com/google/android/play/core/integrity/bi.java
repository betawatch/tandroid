package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
