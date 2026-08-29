package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.e;
import ag.z1;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import e3.f;
import i3.a;
import java.util.concurrent.Executor;
import v5.c;
import y2.i;
import y2.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        c a2 = i.a();
        a2.h(string);
        a2.d = a.b(i10);
        if (string2 != null) {
            a2.b = Base64.decode(string2, 0);
        }
        f fVar = q.a().d;
        ((Executor) fVar.e).execute(new z1(fVar, a2.d(), i11, new e(28, this, jobParameters), 3));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
