package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import ag.o0;
import ag.z1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import e3.f;
import i3.a;
import java.util.concurrent.Executor;
import v5.c;
import y2.i;
import y2.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        c a2 = i.a();
        a2.h(queryParameter);
        a2.d = a.b(intValue);
        if (queryParameter2 != null) {
            a2.b = Base64.decode(queryParameter2, 0);
        }
        f fVar = q.a().d;
        ((Executor) fVar.e).execute(new z1(fVar, a2.d(), i10, new o0(5), 3));
    }
}
