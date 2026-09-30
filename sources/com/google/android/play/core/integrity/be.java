package com.google.android.play.core.integrity;

import a9.k0;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
final class be extends k0 {
    final /* synthetic */ Context a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        this.b = bnVar;
    }

    @Override // a9.k0
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.a;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(Integer.valueOf(a9.g.a(context)));
    }
}
