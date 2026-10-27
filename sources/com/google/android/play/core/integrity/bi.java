package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
class bi extends b9.y {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // b9.z
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // b9.z
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // b9.z
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // b9.z
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
