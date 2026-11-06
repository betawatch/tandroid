package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import h6.m;
import ia.c;
import java.util.concurrent.Executor;
import o5.i;
import o5.s;
import org.telegram.ui.Components.pp0;
import ti.p;
import y5.a;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        m a10 = i.a();
        a10.F(string);
        a10.d = a.b(i7);
        if (string2 != null) {
            a10.c = Base64.decode(string2, 0);
        }
        c cVar = s.a().d;
        ((Executor) cVar.e).execute(new pp0(cVar, a10.h(), i10, new p(3, this, jobParameters), 24));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
