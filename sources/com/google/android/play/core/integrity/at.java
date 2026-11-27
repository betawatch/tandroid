package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class at {
    private final m4d a;
    private final m4d b;

    public at(m4d m4dVar, m4d m4dVar2) {
        this.a = m4dVar;
        this.b = m4dVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, y3d y3dVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        y3dVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, y3dVar);
    }
}
