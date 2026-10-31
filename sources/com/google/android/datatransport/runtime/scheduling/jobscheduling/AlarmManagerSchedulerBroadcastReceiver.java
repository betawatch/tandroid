package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.a0;
import android.util.Base64;
import ea.d;
import java.util.concurrent.Executor;
import l5.i;
import l5.s;
import org.telegram.ui.Components.c11;
import v5.a;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        a0 a2 = i.a();
        a2.y(queryParameter);
        a2.d = a.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        d dVar = s.a().d;
        ((Executor) dVar.e).execute(new c11(dVar, a2.f(), i10, new r5.a(0), 18));
    }
}
