package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        i3c.b(context);
        mx6 a2 = rb0.a();
        a2.m0(queryParameter);
        a2.d = gl8.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        za0 za0Var = i3c.a().d;
        ((Executor) za0Var.e).execute(new tda(za0Var, a2.u(), i, new jd((byte) 0), (byte) 13));
    }
}
