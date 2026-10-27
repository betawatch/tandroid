package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.b0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;
import k6.c;
import m5.i;
import m5.t;
import org.telegram.ui.Components.as0;
import org.telegram.ui.w90;
import w5.a;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        c a2 = i.a();
        a2.H(queryParameter);
        a2.d = a.b(intValue);
        if (queryParameter2 != null) {
            a2.b = Base64.decode(queryParameter2, 0);
        }
        b0 b0Var = t.a().d;
        ((Executor) b0Var.g).execute(new as0(b0Var, a2.j(), i10, new w90(21), 22));
    }
}
