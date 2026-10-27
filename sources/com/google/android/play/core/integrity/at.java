package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class at {
    private final b9.s a;
    private final b9.s b;

    public at(b9.s sVar, b9.s sVar2) {
        this.a = sVar;
        this.b = sVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, b9.d dVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, dVar);
    }
}
