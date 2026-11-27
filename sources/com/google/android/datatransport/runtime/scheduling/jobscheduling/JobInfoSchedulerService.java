package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        h5c.b(getApplicationContext());
        rx6 a2 = ta0.a();
        a2.o0(string);
        a2.d = qm8.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        ba0 ba0Var = h5c.a().d;
        ((Executor) ba0Var.e).execute(new efa((Object) ba0Var, (Object) a2.t(), i2, (Object) new tg5(this, jobParameters, (byte) 13), (byte) 14));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
