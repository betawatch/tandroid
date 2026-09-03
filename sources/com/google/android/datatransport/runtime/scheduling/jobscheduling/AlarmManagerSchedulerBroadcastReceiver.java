package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import ag.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import dg.u1;
import e3.g;
import i3.a;
import java.util.concurrent.Executor;
import s5.m;
import y2.i;
import y2.q;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        m a2 = i.a();
        a2.n(queryParameter);
        a2.d = a.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        g gVar = q.a().d;
        ((Executor) gVar.e).execute(new u1(gVar, a2.f(), i10, new f(3), 1));
    }
}
