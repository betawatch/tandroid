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
import org.telegram.ui.Components.kp0;
import org.telegram.ui.cd0;
import y5.a;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        a10.I(queryParameter);
        a10.d = a.b(intValue);
        if (queryParameter2 != null) {
            a10.c = Base64.decode(queryParameter2, 0);
        }
        c cVar = t.a().d;
        ((Executor) cVar.e).execute(new kp0(cVar, a10.u(), i7, new cd0(26), 26));
    }
}
