package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
