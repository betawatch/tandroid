package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch a;
    public static volatile boolean b;
    public static final Object c = new Object();
    public static final ai.m0 d = new ai.m0(27);

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
                    Utilities.e.d(d, 60000L);
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
