package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import h6.m;
import ia.c;
import java.util.concurrent.Executor;
import o5.i;
import o5.t;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.web.e1;
import y5.a;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        t.b(getApplicationContext());
        m a10 = i.a();
        a10.F(string);
        a10.d = a.b(i7);
        if (string2 != null) {
            a10.c = Base64.decode(string2, 0);
        }
        c cVar = t.a().d;
        ((Executor) cVar.e).execute(new sp0(cVar, a10.j(), i10, new e1(23, this, jobParameters), 24));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
