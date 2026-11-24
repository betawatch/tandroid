package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class at {
    private final w1d a;
    private final w1d b;

    public at(w1d w1dVar, w1d w1dVar2) {
        this.a = w1dVar;
        this.b = w1dVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, i1d i1dVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        i1dVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, i1dVar);
    }
}
