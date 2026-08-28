package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class at {
    private final k8.r a;
    private final k8.r b;

    public at(k8.r rVar, k8.r rVar2) {
        this.a = rVar;
        this.b = rVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, k8.c cVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        cVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, cVar);
    }
}
