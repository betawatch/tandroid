package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch a;
    public static volatile boolean b;
    public static final Object c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (c) {
            try {
                if (a != null) {
                    if (s2.a) {
                        a8.b("finish keep-alive job");
                    }
                    a.countDown();
                }
                if (b) {
                    if (s2.a) {
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
                    if (s2.a) {
                        a8.b("started keep-alive job");
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
                    if (s2.a) {
                        a8.b("ended keep-alive job");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
