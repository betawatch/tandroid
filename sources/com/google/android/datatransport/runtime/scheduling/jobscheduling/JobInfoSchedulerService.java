package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import ha.c;
import java.util.concurrent.Executor;
import k4.j;
import n5.i;
import n5.s;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.hc1;
import x5.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        j a10 = i.a();
        a10.I(string);
        a10.c = a.b(i3);
        if (string2 != null) {
            a10.b = Base64.decode(string2, 0);
        }
        c cVar = s.a().d;
        ((Executor) cVar.e).execute(new zo0(cVar, a10.l(), i10, new hc1(25, this, jobParameters), 22));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
