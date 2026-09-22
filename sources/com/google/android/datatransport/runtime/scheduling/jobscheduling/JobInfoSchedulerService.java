package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import da.b;
import java.util.concurrent.Executor;
import l5.i;
import l5.t;
import org.telegram.ui.Components.i21;
import org.telegram.ui.web.g1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        t.b(getApplicationContext());
        a a2 = i.a();
        a2.v(string);
        a2.d = v5.a.b(i10);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        b bVar = t.a().d;
        ((Executor) bVar.e).execute(new i21(bVar, a2.h(), i11, new g1(15, this, jobParameters), 16));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
