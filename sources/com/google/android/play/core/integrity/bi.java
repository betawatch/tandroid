package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
class bi extends c9.x {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // c9.y
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // c9.y
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // c9.y
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // c9.y
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
