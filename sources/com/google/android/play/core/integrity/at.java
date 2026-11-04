package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class at {
    private final c9.r a;
    private final c9.r b;

    public at(c9.r rVar, c9.r rVar2) {
        this.a = rVar;
        this.b = rVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, c9.c cVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        cVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, cVar);
    }
}
