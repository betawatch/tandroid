package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
class bi extends o8.w {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // o8.x
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // o8.x
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // o8.x
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // o8.x
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
