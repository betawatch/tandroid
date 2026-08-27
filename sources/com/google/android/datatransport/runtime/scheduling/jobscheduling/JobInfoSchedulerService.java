package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.e;
import ag.k0;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c3.g;
import g3.a;
import java.util.concurrent.Executor;
import u2.b;
import w2.i;
import w2.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        b a2 = i.a();
        a2.h(string);
        a2.d = a.b(i10);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        g gVar = q.a().d;
        ((Executor) gVar.e).execute(new k0(gVar, a2.d(), i11, new e(15, this, jobParameters), 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
