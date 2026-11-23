package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import h6.m;
import ia.c;
import java.util.concurrent.Executor;
import o5.i;
import o5.t;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.web.t1;
import y5.a;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        a10.I(string);
        a10.d = a.b(i7);
        if (string2 != null) {
            a10.c = Base64.decode(string2, 0);
        }
        c cVar = t.a().d;
        ((Executor) cVar.e).execute(new kp0(cVar, a10.u(), i10, new t1(21, this, jobParameters), 26));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
