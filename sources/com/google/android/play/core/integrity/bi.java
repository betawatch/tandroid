package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
