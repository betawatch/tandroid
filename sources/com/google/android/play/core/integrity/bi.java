package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
class bi extends d9.x {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // d9.y
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // d9.y
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // d9.y
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // d9.y
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
