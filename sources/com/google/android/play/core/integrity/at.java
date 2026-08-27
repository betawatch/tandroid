package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class at {
    private final l8.q a;
    private final l8.q b;

    public at(l8.q qVar, l8.q qVar2) {
        this.a = qVar;
        this.b = qVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, l8.c cVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        cVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, cVar);
    }
}
