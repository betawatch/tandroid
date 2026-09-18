package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import da.b;
import java.util.concurrent.Executor;
import l5.i;
import l5.t;
import org.telegram.ui.Components.t11;
import org.telegram.ui.p91;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        t.b(context);
        a a2 = i.a();
        a2.u(queryParameter);
        a2.d = v5.a.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        b bVar = t.a().d;
        ((Executor) bVar.e).execute(new t11(bVar, a2.e(), i10, new p91(12), 16));
    }
}
