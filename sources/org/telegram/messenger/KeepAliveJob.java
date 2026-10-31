package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch a;
    public static volatile boolean b;
    public static final Object c = new Object();
    public static final ag.f3 d = new ag.f3(16);

    public static void a() {
        synchronized (c) {
            try {
                if (a != null) {
                    if (v2.a) {
                        f8.b("finish keep-alive job");
                    }
                    a.countDown();
                }
                if (b) {
                    if (v2.a) {
                        f8.b("finish queued keep-alive job");
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
                    if (v2.a) {
                        f8.b("started keep-alive job");
                    }
                    Utilities.e.d(d, 60000L);
                    try {
                        a.await();
                    } catch (Throwable unused) {
                    }
                    Utilities.e.a(d);
                    synchronized (c) {
                        a = null;
                    }
                    if (v2.a) {
                        f8.b("ended keep-alive job");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
