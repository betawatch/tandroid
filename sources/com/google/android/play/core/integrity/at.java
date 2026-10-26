package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
