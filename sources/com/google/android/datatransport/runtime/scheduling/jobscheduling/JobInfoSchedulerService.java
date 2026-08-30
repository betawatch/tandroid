package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import cg.v1;
import e3.g;
import i3.a;
import java.util.concurrent.Executor;
import s5.m;
import y2.i;
import y2.q;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        m a2 = i.a();
        a2.n(string);
        a2.d = a.b(i10);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        g gVar = q.a().d;
        ((Executor) gVar.e).execute(new v1(gVar, a2.f(), i11, new e(23, this, jobParameters), 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
