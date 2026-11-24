package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class at {
    private final vzc a;
    private final vzc b;

    public at(vzc vzcVar, vzc vzcVar2) {
        this.a = vzcVar;
        this.b = vzcVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, hzc hzcVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        hzcVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, hzcVar);
    }
}
