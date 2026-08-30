package g5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i0 extends Handler implements Runnable {
    public final int a;
    public final j0 b;
    public final long c;
    public h0 d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final /* synthetic */ m0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, Looper looper, j0 j0Var, h0 h0Var, int i10, long j10) {
        super(looper);
        this.s = m0Var;
        this.b = j0Var;
        this.d = h0Var;
        this.a = i10;
        this.c = j10;
    }

    public final void a(boolean z4) {
        this.r = z4;
        this.e = null;
        if (hasMessages(0)) {
            this.n = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.n = true;
                    this.b.r();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z4) {
            this.s.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h0 h0Var = this.d;
            h0Var.getClass();
            h0Var.s(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
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
            m0 m0Var = this.s;
            ExecutorService executorService = m0Var.a;
            i0 i0Var = m0Var.b;
            i0Var.getClass();
            executorService.execute(i0Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.s.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.c;
        h0 h0Var = this.d;
        h0Var.getClass();
        if (this.n) {
            h0Var.s(this.b, elapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                h0Var.A(this.b, elapsedRealtime, j10);
                return;
            } catch (RuntimeException e) {
                h5.a.p("LoadTask", "Unexpected exception handling load completed", e);
                this.s.c = new l0(e);
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
        c4.e m9 = h0Var.m(this.b, iOException, i12);
        int i13 = m9.a;
        if (i13 == 3) {
            this.s.c = this.e;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f = 1;
            }
            long j11 = m9.b;
            if (j11 == -9223372036854775807L) {
                j11 = Math.min((this.f - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            }
            m0 m0Var2 = this.s;
            h5.a.i(m0Var2.b == null);
            m0Var2.b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(0, j11);
            } else {
                this.e = null;
                m0Var2.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.n;
                this.h = Thread.currentThread();
            }
            if (!z4) {
                h5.a.c("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    h5.a.q();
                } catch (Throwable th2) {
                    h5.a.q();
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
        } catch (IOException e) {
            if (this.r) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e6) {
            if (this.r) {
                return;
            }
            h5.a.p("LoadTask", "Unexpected exception loading stream", e6);
            obtainMessage(2, new l0(e6)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.r) {
                return;
            }
            h5.a.p("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(2, new l0(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.r) {
                h5.a.p("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
