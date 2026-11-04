package a3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import b8.zb;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends Handler implements Runnable {
    public final int a;
    public final m b;
    public final long c;
    public k d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final /* synthetic */ q s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Looper looper, m mVar, k kVar, int i3, long j10) {
        super(looper);
        this.s = qVar;
        this.b = mVar;
        this.d = kVar;
        this.a = i3;
        this.c = j10;
    }

    public final void a(boolean z10) {
        this.r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.n = true;
                    this.b.X1();
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
            k kVar = this.d;
            kVar.getClass();
            kVar.q0(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.c;
        k kVar = this.d;
        kVar.getClass();
        kVar.M(this.b, elapsedRealtime, j10, this.f);
        this.e = null;
        q qVar = this.s;
        b3.a aVar = qVar.a;
        l lVar = qVar.b;
        lVar.getClass();
        aVar.execute(lVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.r) {
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            b();
            return;
        }
        if (i3 == 4) {
            throw ((Error) message.obj);
        }
        this.s.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.c;
        k kVar = this.d;
        kVar.getClass();
        if (this.n) {
            kVar.q0(this.b, elapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                kVar.h(this.b, elapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                g2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.s.c = new p(e10);
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i11 = this.f + 1;
        this.f = i11;
        i k10 = kVar.k(this.b, elapsedRealtime, j10, iOException, i11);
        int i12 = k10.a;
        if (i12 == 3) {
            this.s.c = this.e;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f = 1;
            }
            long j11 = k10.b;
            if (j11 == -9223372036854775807L) {
                j11 = Math.min((this.f - 1) * 1000, 5000);
            }
            q qVar = this.s;
            zb.p(qVar.b == null);
            qVar.b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(1, j11);
            } else {
                b();
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
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
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
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.r) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.r) {
                return;
            }
            g2.a.d("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new p(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.r) {
                return;
            }
            g2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new p(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.r) {
                g2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
