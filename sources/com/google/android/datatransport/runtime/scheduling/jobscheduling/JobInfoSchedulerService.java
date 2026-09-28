package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import da.b;
import java.util.concurrent.Executor;
import l5.i;
import l5.s;
import org.telegram.ui.Components.h21;
import org.telegram.ui.web.o1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        a a2 = i.a();
        a2.t(string);
        a2.d = v5.a.b(i10);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        b bVar = s.a().d;
        ((Executor) bVar.e).execute(new h21(bVar, a2.e(), i11, new o1(14, this, jobParameters), 16));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
