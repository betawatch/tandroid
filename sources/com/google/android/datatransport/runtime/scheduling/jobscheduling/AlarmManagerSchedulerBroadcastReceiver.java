package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import da.c;
import java.util.concurrent.Executor;
import l5.i;
import l5.s;
import org.telegram.ui.Components.x21;
import org.telegram.ui.t21;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        c cVar = s.a().d;
        ((Executor) cVar.e).execute(new x21(cVar, a2.d(), i10, new t21(16), 18));
    }
}
