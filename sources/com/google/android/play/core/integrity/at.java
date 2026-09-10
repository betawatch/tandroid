package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
