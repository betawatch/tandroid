package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.support.v4.media.session.a0;
import android.util.Base64;
import ea.d;
import java.util.concurrent.Executor;
import l5.i;
import l5.s;
import org.telegram.ui.Components.c11;
import org.telegram.ui.web.v1;
import v5.a;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        a0 a2 = i.a();
        a2.y(string);
        a2.d = a.b(i10);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        d dVar = s.a().d;
        ((Executor) dVar.e).execute(new c11(dVar, a2.f(), i11, new v1(26, this, jobParameters), 18));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
