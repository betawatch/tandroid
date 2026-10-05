package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
final class at {
    private final a9.u a;
    private final a9.u b;

    public at(a9.u uVar, a9.u uVar2) {
        this.a = uVar;
        this.b = uVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, a9.e eVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        eVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, eVar);
    }
}
