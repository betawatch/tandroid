package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
class bi extends g0d {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // g0d
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // g0d
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // g0d
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // g0d
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
