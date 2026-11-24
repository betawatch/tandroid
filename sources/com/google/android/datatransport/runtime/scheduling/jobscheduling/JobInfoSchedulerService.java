package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        i3c.b(getApplicationContext());
        mx6 a2 = rb0.a();
        a2.m0(string);
        a2.d = gl8.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        za0 za0Var = i3c.a().d;
        ((Executor) za0Var.e).execute(new tda((Object) za0Var, (Object) a2.u(), i2, (Object) new fd5(this, jobParameters, (byte) 17), (byte) 13));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
