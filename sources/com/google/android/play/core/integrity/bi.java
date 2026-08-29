package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
class bi extends m8.x {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // m8.y
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // m8.y
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // m8.y
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // m8.y
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
