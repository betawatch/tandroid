package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
final class at {
    private final d9.r a;
    private final d9.r b;

    public at(d9.r rVar, d9.r rVar2) {
        this.a = rVar;
        this.b = rVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, d9.c cVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        cVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, cVar);
    }
}
