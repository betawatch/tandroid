package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import ha.c;
import java.util.concurrent.Executor;
import k4.j;
import n5.i;
import n5.s;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.hb1;
import x5.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        j a10 = i.a();
        a10.I(queryParameter);
        a10.c = a.b(intValue);
        if (queryParameter2 != null) {
            a10.b = Base64.decode(queryParameter2, 0);
        }
        c cVar = s.a().d;
        ((Executor) cVar.e).execute(new zo0(cVar, a10.l(), i3, new hb1(13), 22));
    }
}
