package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import aa.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import da.b;
import java.util.concurrent.Executor;
import l5.i;
import l5.s;
import org.telegram.ui.Components.r11;
import org.telegram.ui.web.g1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        a2.B(string);
        a2.d = v5.a.b(i10);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        b bVar = s.a().d;
        ((Executor) bVar.e).execute(new r11(bVar, a2.f(), i11, new g1(12, this, jobParameters), 15));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
