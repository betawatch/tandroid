package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch a;
    public static volatile boolean b;
    public static final Object c = new Object();
    public static final ai.y1 d = new ai.y1(29);

    public static void a() {
        synchronized (c) {
            try {
                if (a != null) {
                    if (r2.a) {
                        a8.b("finish keep-alive job");
                    }
                    a.countDown();
                }
                if (b) {
                    if (r2.a) {
                        a8.b("finish queued keep-alive job");
                    }
                    b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.messenger.support.JobIntentService
    public final void onHandleWork(Intent intent) {
        synchronized (c) {
            try {
                if (b) {
                    a = new CountDownLatch(1);
                    if (r2.a) {
                        a8.b("started keep-alive job");
                    }
                    Utilities.e.e(d, 60000L);
                    try {
                        a.await();
                    } catch (Throwable unused) {
                    }
                    Utilities.e.a(d);
                    synchronized (c) {
                        a = null;
                    }
                    if (r2.a) {
                        a8.b("ended keep-alive job");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
