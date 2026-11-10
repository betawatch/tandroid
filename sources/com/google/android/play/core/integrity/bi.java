package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
