package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class at {
    private final a9.t a;
    private final a9.t b;

    public at(a9.t tVar, a9.t tVar2) {
        this.a = tVar;
        this.b = tVar2;
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
