package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class KeepAliveJob extends JobIntentService {
    private static volatile CountDownLatch countDownLatch;
    private static volatile boolean startingJob;
    private static final Object sync = new Object();
    private static Runnable finishJobByTimeoutRunnable = new v1(11);

    public static void finishJob() {
        Utilities.globalQueue.postRunnable(new v1(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finishJobInternal() {
        synchronized (sync) {
            try {
                if (countDownLatch != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("finish keep-alive job");
                    }
                    countDownLatch.countDown();
                }
                if (startingJob) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("finish queued keep-alive job");
                    }
                    startingJob = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startJob$0() {
        if (startingJob || countDownLatch != null) {
            return;
        }
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("starting keep-alive job");
            }
            synchronized (sync) {
                startingJob = true;
            }
            JobIntentService.enqueueWork(ApplicationLoader.applicationContext, KeepAliveJob.class, MediaDataController.MAX_STYLE_RUNS_COUNT, new Intent());
        } catch (Exception unused) {
        }
    }

    public static void startJob() {
        Utilities.globalQueue.postRunnable(new v1(12));
    }

    @Override // org.telegram.messenger.support.JobIntentService
    public void onHandleWork(Intent intent) {
        synchronized (sync) {
            try {
                if (startingJob) {
                    countDownLatch = new CountDownLatch(1);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("started keep-alive job");
                    }
                    Utilities.globalQueue.postRunnable(finishJobByTimeoutRunnable, 60000L);
                    try {
                        countDownLatch.await();
                    } catch (Throwable unused) {
                    }
                    Utilities.globalQueue.cancelRunnable(finishJobByTimeoutRunnable);
                    synchronized (sync) {
                        countDownLatch = null;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("ended keep-alive job");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
