package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p5 extends Thread {
    public volatile Handler a;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int e = -1000;

    public p5(String str) {
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
                    if (((o5) this.c.get(size)).b == runnable) {
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
        } catch (Exception e10) {
            a8.g(e10, false);
        }
        return this.a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j3) {
        Handler handler = this.a;
        if (handler != null) {
            return j3 <= 0 ? handler.post(runnable) : handler.postDelayed(runnable, j3);
        }
        long max = Math.max(0L, j3) + SystemClock.uptimeMillis();
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    return this.a.postAtTime(runnable, max);
                }
                arrayList.add(new o5(0, max, runnable));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new n5(this, 1));
        synchronized (this.b) {
            for (int i7 = 0; i7 < this.c.size(); i7++) {
                try {
                    o5 o5Var = (o5) this.c.get(i7);
                    int i10 = o5Var.a;
                    if (i10 == 0) {
                        handler.postAtTime(o5Var.b, o5Var.c);
                    } else if (i10 == 1) {
                        handler.postAtFrontOfQueue(o5Var.b);
                    } else {
                        handler.sendMessageAtTime(null, o5Var.c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.c = null;
            this.a = handler;
        }
        this.d.countDown();
        int i11 = this.e;
        if (i11 != -1000) {
            Process.setThreadPriority(i11);
        }
        Looper.loop();
    }
}
