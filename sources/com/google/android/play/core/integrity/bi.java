package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
