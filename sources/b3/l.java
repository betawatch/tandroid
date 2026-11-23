package b3;

import a8.la;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
    public final /* synthetic */ p s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, Looper looper, m mVar, k kVar, int i7, long j3) {
        super(looper);
        this.s = pVar;
        this.b = mVar;
        this.d = kVar;
        this.a = i7;
        this.c = j3;
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
                    this.b.A();
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
            kVar.p(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.c;
        k kVar = this.d;
        kVar.getClass();
        kVar.s(this.b, elapsedRealtime, j3, this.f);
        this.e = null;
        p pVar = this.s;
        c3.a aVar = pVar.a;
        l lVar = pVar.b;
        lVar.getClass();
        aVar.execute(lVar);
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
        k kVar = this.d;
        kVar.getClass();
        if (this.n) {
            kVar.p(this.b, elapsedRealtime, j3, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                kVar.z(this.b, elapsedRealtime, j3);
                return;
            } catch (RuntimeException e10) {
                h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.s.c = new o(e10);
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
        i l10 = kVar.l(this.b, elapsedRealtime, j3, iOException, i11);
        int i12 = l10.a;
        if (i12 == 3) {
            this.s.c = this.e;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f = 1;
            }
            long j10 = l10.b;
            if (j10 == -9223372036854775807L) {
                j10 = Math.min((this.f - 1) * 1000, 5000);
            }
            p pVar = this.s;
            la.p(pVar.b == null);
            pVar.b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
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
            h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new o(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.r) {
                return;
            }
            h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new o(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
