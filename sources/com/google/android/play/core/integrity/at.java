package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class at {
    private final o8.q a;
    private final o8.q b;

    public at(o8.q qVar, o8.q qVar2) {
        this.a = qVar;
        this.b = qVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, o8.c cVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        cVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, cVar);
    }
}
