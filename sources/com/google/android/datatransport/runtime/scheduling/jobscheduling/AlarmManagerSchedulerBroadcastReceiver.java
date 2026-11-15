package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import h6.m;
import ia.c;
import java.util.concurrent.Executor;
import o5.i;
import o5.t;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.ah0;
import y5.a;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        t.b(context);
        m a10 = i.a();
        a10.F(queryParameter);
        a10.d = a.b(intValue);
        if (queryParameter2 != null) {
            a10.c = Base64.decode(queryParameter2, 0);
        }
        c cVar = t.a().d;
        ((Executor) cVar.e).execute(new sp0(cVar, a10.j(), i7, new ah0(23), 24));
    }
}
