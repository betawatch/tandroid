package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        i1c.b(context);
        mv6 a2 = ra0.a();
        a2.j0(queryParameter);
        a2.d = dj8.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        z90 z90Var = i1c.a().d;
        ((Executor) z90Var.e).execute(new ica(z90Var, a2.o(), i, new jc((byte) 0), (byte) 12));
    }
}
