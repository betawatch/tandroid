package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 extends Handler implements Runnable {
    public final int a;
    public final n0 b;
    public final long c;
    public l0 d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final /* synthetic */ q0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, Looper looper, n0 n0Var, l0 l0Var, int i10, long j10) {
        super(looper);
        this.s = q0Var;
        this.b = n0Var;
        this.d = l0Var;
        this.a = i10;
        this.c = j10;
    }

    public final void a(boolean z10) {
        this.r = z10;
        this.e = null;
        if (hasMessages(0)) {
            this.n = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.n = true;
                    this.b.q();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.s.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l0 l0Var = this.d;
            l0Var.getClass();
            l0Var.g(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.r) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.e = null;
            q0 q0Var = this.s;
            ExecutorService executorService = q0Var.a;
            m0 m0Var = q0Var.b;
            m0Var.getClass();
            executorService.execute(m0Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.s.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.c;
        l0 l0Var = this.d;
        l0Var.getClass();
        if (this.n) {
            l0Var.g(this.b, elapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                l0Var.m(this.b, elapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                f5.a.p("LoadTask", "Unexpected exception handling load completed", e10);
                this.s.c = new p0(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i12 = this.f + 1;
        this.f = i12;
        k0 j11 = l0Var.j(this.b, iOException, i12);
        int i13 = j11.a;
        if (i13 == 3) {
            this.s.c = this.e;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f = 1;
            }
            long j12 = j11.b;
            if (j12 == -9223372036854775807L) {
                j12 = Math.min((this.f - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            }
            q0 q0Var2 = this.s;
            f5.a.i(q0Var2.b == null);
            q0Var2.b = this;
            if (j12 > 0) {
                sendEmptyMessageDelayed(0, j12);
            } else {
                this.e = null;
                q0Var2.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                f5.a.c("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    f5.a.q();
                } catch (Throwable th2) {
                    f5.a.q();
                    throw th2;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.r) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.r) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.r) {
                return;
            }
            f5.a.p("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(2, new p0(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.r) {
                return;
            }
            f5.a.p("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(2, new p0(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.r) {
                f5.a.p("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
