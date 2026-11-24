// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class co3 extends Thread {
    public volatile Handler a;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int e = -1000;

    public co3(String str) {
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
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                this.a.removeCallbacks(runnable);
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((bo3) this.c.get(size)).b == runnable) {
                    this.c.remove(size);
                }
            }
        }
    }

    public final Handler b() {
        try {
            this.d.await();
        } catch (Exception e) {
            fa4.g(e, false);
        }
        return this.a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j) {
        Handler handler = this.a;
        if (handler != null) {
            return j <= 0 ? handler.post(runnable) : handler.postDelayed(runnable, j);
        }
        long max = Math.max(0L, j) + SystemClock.uptimeMillis();
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                return this.a.postAtTime(runnable, max);
            }
            arrayList.add(new bo3(0, max, runnable));
            return true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new ao3());
        synchronized (this.b) {
            for (int i = 0; i < this.c.size(); i++) {
                bo3 bo3Var = (bo3) this.c.get(i);
                boolean z = bo3Var.a;
                if (!z) {
                    handler.postAtTime(bo3Var.b, bo3Var.c);
                } else if (z) {
                    handler.postAtFrontOfQueue(bo3Var.b);
                } else {
                    handler.sendMessageAtTime(null, bo3Var.c);
                }
            }
            this.c = null;
            this.a = handler;
        }
        this.d.countDown();
        int i2 = this.e;
        if (i2 != -1000) {
            Process.setThreadPriority(i2);
        }
        Looper.loop();
    }
}
