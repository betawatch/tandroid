package h6;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o {
    public static final Object i = new Object();
    public final b a;
    public final long b;
    public final String c;
    public n g;
    public a5.d h;
    public long e = -1;
    public long f = 0;
    public final y d = new y(Looper.getMainLooper(), 0);

    public o(long j10, String str) {
        this.b = j10;
        this.c = str;
        this.a = new b("RequestTracker", str);
    }

    public final void a(long j10, n nVar) {
        n nVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            nVar2 = this.g;
            j11 = this.e;
            j12 = this.f;
            this.e = j10;
            this.g = nVar;
            this.f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.h(this.c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                a5.d dVar = this.h;
                if (dVar != null) {
                    this.d.removeCallbacks(dVar);
                }
                a5.d dVar2 = new a5.d(this, 24);
                this.h = dVar2;
                this.d.postDelayed(dVar2, this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, l lVar) {
        synchronized (i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i10, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (i) {
            long j11 = this.e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (i) {
            z10 = this.e != -1;
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.g;
                    o6.l.h(nVar);
                    nVar.t(this.c, this.e, i10, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    a5.d dVar = this.h;
                    if (dVar != null) {
                        this.d.removeCallbacks(dVar);
                        this.h = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (i) {
            try {
                if (!d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                e("clearing request " + this.e, i10, null);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
