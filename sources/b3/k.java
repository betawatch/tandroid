package b3;

import a8.ia;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k extends Handler implements Runnable {
    public final int a;
    public final l b;
    public final long c;
    public j d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final /* synthetic */ o s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Looper looper, l lVar, j jVar, int i7, long j3) {
        super(looper);
        this.s = oVar;
        this.b = lVar;
        this.d = jVar;
        this.a = i7;
        this.c = j3;
    }

    public final void a(boolean z9) {
        this.r = z9;
        this.e = null;
        if (hasMessages(1)) {
            this.n = true;
            removeMessages(1);
            if (!z9) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.n = true;
                    this.b.q0();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z9) {
            this.s.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.d;
            jVar.getClass();
            jVar.q0(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.c;
        j jVar = this.d;
        jVar.getClass();
        jVar.M0(this.b, elapsedRealtime, j3, this.f);
        this.e = null;
        o oVar = this.s;
        c3.a aVar = oVar.a;
        k kVar = oVar.b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.r) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            b();
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        this.s.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.c;
        j jVar = this.d;
        jVar.getClass();
        if (this.n) {
            jVar.q0(this.b, elapsedRealtime, j3, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                jVar.o1(this.b, elapsedRealtime, j3);
                return;
            } catch (RuntimeException e10) {
                h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.s.c = new n(e10);
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
        i o02 = jVar.o0(this.b, elapsedRealtime, j3, iOException, i11);
        int i12 = o02.a;
        if (i12 == 3) {
            this.s.c = this.e;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f = 1;
            }
            long j10 = o02.b;
            if (j10 == -9223372036854775807L) {
                j10 = Math.min((this.f - 1) * 1000, 5000);
            }
            o oVar = this.s;
            ia.p(oVar.b == null);
            oVar.b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            synchronized (this) {
                z9 = this.n;
                this.h = Thread.currentThread();
            }
            if (!z9) {
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
            h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new n(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.r) {
                return;
            }
            h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new n(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
