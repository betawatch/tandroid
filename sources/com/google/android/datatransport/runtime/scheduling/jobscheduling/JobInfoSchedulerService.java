package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        i1c.b(getApplicationContext());
        mv6 a2 = ra0.a();
        a2.j0(string);
        a2.d = dj8.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        z90 z90Var = i1c.a().d;
        ((Executor) z90Var.e).execute(new ica((Object) z90Var, (Object) a2.o(), i2, (Object) new hb5(this, jobParameters, (byte) 16), (byte) 12));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
