package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c3.d;
import c3.h;
import g3.a;
import java.util.concurrent.Executor;
import t5.c;
import w2.i;
import w2.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i9 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        c a2 = i.a();
        a2.h(string);
        a2.d = a.b(i9);
        if (string2 != null) {
            a2.b = Base64.decode(string2, 0);
        }
        h hVar = q.a().d;
        ((Executor) hVar.e).execute(new d(hVar, a2.b(), i10, new e(20, this, jobParameters), 0));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
