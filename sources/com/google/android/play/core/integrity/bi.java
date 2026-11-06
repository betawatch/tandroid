package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
