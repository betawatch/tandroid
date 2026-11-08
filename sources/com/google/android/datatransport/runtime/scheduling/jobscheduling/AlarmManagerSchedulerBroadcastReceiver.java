package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import h6.m;
import ia.c;
import java.util.concurrent.Executor;
import o5.i;
import o5.s;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.o61;
import y5.a;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        m a10 = i.a();
        a10.F(queryParameter);
        a10.d = a.b(intValue);
        if (queryParameter2 != null) {
            a10.c = Base64.decode(queryParameter2, 0);
        }
        c cVar = s.a().d;
        ((Executor) cVar.e).execute(new pp0(cVar, a10.h(), i7, new o61(19), 24));
    }
}
