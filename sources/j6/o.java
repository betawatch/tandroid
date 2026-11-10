package j6;

import a8.ra;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.Locale;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o {
    public static final Object i = new Object();
    public final b a;
    public final long b;
    public final String c;
    public n g;
    public ra h;
    public long e = -1;
    public long f = 0;
    public final y d = new y(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.b = j3;
        this.c = str;
        this.a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            nVar2 = this.g;
            j10 = this.e;
            j11 = this.f;
            this.e = j3;
            this.g = nVar;
            this.f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.v(this.c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                ra raVar = this.h;
                if (raVar != null) {
                    this.d.removeCallbacks(raVar);
                }
                ra raVar2 = new ra(this, 27);
                this.h = raVar2;
                this.d.postDelayed(raVar2, this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i7, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j3) {
        boolean z9;
        synchronized (i) {
            long j10 = this.e;
            z9 = false;
            if (j10 != -1 && j10 == j3) {
                z9 = true;
            }
        }
        return z9;
    }

    public final boolean d() {
        boolean z9;
        synchronized (i) {
            z9 = this.e != -1;
        }
        return z9;
    }

    public final void e(String str, int i7, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.g;
                    q6.m.g(nVar);
                    nVar.H(this.c, this.e, i7, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    ra raVar = this.h;
                    if (raVar != null) {
                        this.d.removeCallbacks(raVar);
                        this.h = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean f(int i7) {
        synchronized (i) {
            try {
                if (!d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                e("clearing request " + this.e, i7, null);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
