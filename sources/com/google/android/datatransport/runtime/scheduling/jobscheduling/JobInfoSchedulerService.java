package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import dg.u1;
import e3.g;
import i3.a;
import java.util.concurrent.Executor;
import s5.m;
import y2.i;
import y2.q;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        ((Executor) gVar.e).execute(new u1(gVar, a2.f(), i11, new e(20, this, jobParameters), 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
