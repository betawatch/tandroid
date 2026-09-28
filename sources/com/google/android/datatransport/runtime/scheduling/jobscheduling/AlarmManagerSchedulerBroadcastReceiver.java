package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import da.b;
import java.util.concurrent.Executor;
import l5.i;
import l5.s;
import org.telegram.ui.Components.h21;
import org.telegram.ui.l21;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        a a2 = i.a();
        a2.t(queryParameter);
        a2.d = v5.a.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        b bVar = s.a().d;
        ((Executor) bVar.e).execute(new h21(bVar, a2.e(), i10, new l21(14), 16));
    }
}
