package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import bg.d2;
import c3.d;
import c3.h;
import g3.a;
import java.util.concurrent.Executor;
import t5.c;
import w2.i;
import w2.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i9 = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        c a2 = i.a();
        a2.h(queryParameter);
        a2.d = a.b(intValue);
        if (queryParameter2 != null) {
            a2.b = Base64.decode(queryParameter2, 0);
        }
        h hVar = q.a().d;
        ((Executor) hVar.e).execute(new d(hVar, a2.b(), i9, new d2(1), 0));
    }
}
