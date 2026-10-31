package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r5 extends Thread {
    public volatile Handler a;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int e = -1000;

    public r5(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    this.a.removeCallbacks(runnable);
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((q5) this.c.get(size)).b == runnable) {
                        this.c.remove(size);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler b() {
        try {
            this.d.await();
        } catch (Exception e) {
            f8.g(e, false);
        }
        return this.a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j10) {
        Handler handler = this.a;
        if (handler != null) {
            return j10 <= 0 ? handler.post(runnable) : handler.postDelayed(runnable, j10);
        }
        long max = Math.max(0L, j10) + SystemClock.uptimeMillis();
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    return this.a.postAtTime(runnable, max);
                }
                arrayList.add(new q5(0, max, runnable));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new p5(this, 1));
        synchronized (this.b) {
            for (int i10 = 0; i10 < this.c.size(); i10++) {
                try {
                    q5 q5Var = (q5) this.c.get(i10);
                    int i11 = q5Var.a;
                    if (i11 == 0) {
                        handler.postAtTime(q5Var.b, q5Var.c);
                    } else if (i11 == 1) {
                        handler.postAtFrontOfQueue(q5Var.b);
                    } else {
                        handler.sendMessageAtTime(null, q5Var.c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.c = null;
            this.a = handler;
        }
        this.d.countDown();
        int i12 = this.e;
        if (i12 != -1000) {
            Process.setThreadPriority(i12);
        }
        Looper.loop();
    }
}
