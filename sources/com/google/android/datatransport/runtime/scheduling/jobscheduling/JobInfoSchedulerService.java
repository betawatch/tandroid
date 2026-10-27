package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.b0;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
import k6.c;
import m5.i;
import m5.t;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Wallet.a6;
import w5.a;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        c a2 = i.a();
        a2.H(string);
        a2.d = a.b(i10);
        if (string2 != null) {
            a2.b = Base64.decode(string2, 0);
        }
        b0 b0Var = t.a().d;
        ((Executor) b0Var.g).execute(new as0(b0Var, a2.j(), i11, new a6(28, this, jobParameters), 22));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
