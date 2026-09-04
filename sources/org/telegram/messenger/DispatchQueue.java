package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class DispatchQueue extends Thread {
    private static final int THREAD_PRIORITY_DEFAULT = -1000;
    private static int indexPointer;
    private volatile Handler handler;
    public final int index;
    private long lastTaskTime;
    private CountDownLatch syncLatch;
    private int threadPriority;

    public DispatchQueue(String str) {
        this(str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$run$0(Message message) {
        handleMessage(message);
        return true;
    }

    public void cancelRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacks(runnable);
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnableArr) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
        }
    }

    public void cleanupQueue() {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacksAndMessages(null);
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public boolean isReady() {
        return this.syncLatch.getCount() == 0;
    }

    public boolean postRunnable(Runnable runnable) {
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public boolean postToFrontRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
        }
        return this.handler.postAtFrontOfQueue(runnable);
    }

    public void recycle() {
        this.handler.getLooper().quit();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new x1(this, 0));
        this.syncLatch.countDown();
        int i10 = this.threadPriority;
        if (i10 != THREAD_PRIORITY_DEFAULT) {
            Process.setThreadPriority(i10);
        }
        Looper.loop();
    }

    public void sendMessage(Message message, int i10) {
        try {
            this.syncLatch.await();
            if (i10 <= 0) {
                this.handler.sendMessage(message);
            } else {
                this.handler.sendMessageDelayed(message, i10);
            }
        } catch (Exception unused) {
        }
    }

    public DispatchQueue(String str, boolean z10) {
        this.handler = null;
        this.syncLatch = new CountDownLatch(1);
        int i10 = indexPointer;
        indexPointer = i10 + 1;
        this.index = i10;
        this.threadPriority = THREAD_PRIORITY_DEFAULT;
        setName(str);
        if (z10) {
            start();
        }
    }

    public boolean postRunnable(Runnable runnable, long j3) {
        try {
            this.syncLatch.await();
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
        }
        if (j3 <= 0) {
            return this.handler.post(runnable);
        }
        return this.handler.postDelayed(runnable, j3);
    }

    public DispatchQueue(String str, boolean z10, int i10) {
        this.handler = null;
        this.syncLatch = new CountDownLatch(1);
        int i11 = indexPointer;
        indexPointer = i11 + 1;
        this.index = i11;
        this.threadPriority = i10;
        setName(str);
        if (z10) {
            start();
        }
    }

    public void handleMessage(Message message) {
    }
}
