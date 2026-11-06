package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
