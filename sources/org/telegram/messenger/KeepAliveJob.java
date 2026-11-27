package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch a;
    public static volatile boolean b;
    public static final Object c = new Object();
    public static final jm3 d = new jm3((byte) 18);

    public static void a() {
        synchronized (c) {
            if (a != null) {
                if (f11.a) {
                    cc4.b("finish keep-alive job");
                }
                a.countDown();
            }
            if (b) {
                if (f11.a) {
                    cc4.b("finish queued keep-alive job");
                }
                b = false;
            }
        }
    }

    @Override // org.telegram.messenger.support.JobIntentService
    public final void onHandleWork(Intent intent) {
        synchronized (c) {
            if (b) {
                a = new CountDownLatch(1);
                if (f11.a) {
                    cc4.b("started keep-alive job");
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
                if (f11.a) {
                    cc4.b("ended keep-alive job");
                }
            }
        }
    }
}
