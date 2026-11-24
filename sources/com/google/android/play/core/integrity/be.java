package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class be extends u2d {
    final /* synthetic */ Context a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        this.b = bnVar;
    }

    @Override // u2d
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.a;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(Integer.valueOf(k1d.a(context)));
    }
}
