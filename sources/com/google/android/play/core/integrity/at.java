package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
