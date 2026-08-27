package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import ag.k0;
import ag.l3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c3.g;
import g3.a;
import java.util.concurrent.Executor;
import u2.b;
import w2.i;
import w2.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        b a2 = i.a();
        a2.h(queryParameter);
        a2.d = a.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        g gVar = q.a().d;
        ((Executor) gVar.e).execute(new k0(gVar, a2.d(), i10, new l3(1), 1));
    }
}
