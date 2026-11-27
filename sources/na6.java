// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class na6 extends Handler implements Runnable {
    public final int a;
    public final oa6 b;
    public final long c;
    public la6 d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final /* synthetic */ rx6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na6(rx6 rx6Var, Looper looper, oa6 oa6Var, la6 la6Var, int i, long j) {
        super(looper);
        this.s = rx6Var;
        this.b = oa6Var;
        this.d = la6Var;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.r = z;
        this.e = null;
        if (hasMessages(1)) {
            this.n = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.n = true;
                this.b.c();
                Thread thread = this.h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.s.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            la6 la6Var = this.d;
            la6Var.getClass();
            la6Var.f(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        la6 la6Var = this.d;
        la6Var.getClass();
        la6Var.R0(this.b, elapsedRealtime, j, this.f);
        this.e = null;
        rx6 rx6Var = this.s;
        r99 r99Var = (r99) rx6Var.b;
        na6 na6Var = (na6) rx6Var.c;
        na6Var.getClass();
        r99Var.execute(na6Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.r) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.s.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        la6 la6Var = this.d;
        la6Var.getClass();
        if (this.n) {
            la6Var.f(this.b, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                la6Var.f0(this.b, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                efd.d("LoadTask", "Unexpected exception handling load completed", e);
                this.s.d = new qa6(e);
                return;
            }
        }
        if (i2 == 3) {
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            ma6 c2 = la6Var.c2(this.b, elapsedRealtime, j, iOException, i3);
            byte b = c2.a;
            if (b == 3) {
                this.s.d = this.e;
                return;
            }
            if (b != 2) {
                if (b == 1) {
                    this.f = 1;
                }
                long j2 = c2.b;
                if (j2 == -9223372036854775807L) {
                    j2 = Math.min((this.f - 1) * 1000, 5000);
                }
                rx6 rx6Var = this.s;
                yve.p(((na6) rx6Var.c) == null);
                rx6Var.c = this;
                if (j2 > 0) {
                    sendEmptyMessageDelayed(1, j2);
                } else {
                    b();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.n;
                this.h = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.r) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.r) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            if (!this.r) {
                efd.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.r) {
                return;
            }
            efd.d("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new qa6(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.r) {
                return;
            }
            efd.d("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new qa6(e4)).sendToTarget();
        }
    }
}
