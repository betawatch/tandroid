package g6;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.Locale;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o {
    public static final Object i = new Object();
    public final b a;
    public final long b;
    public final String c;
    public n g;
    public androidx.activity.i h;
    public long e = -1;
    public long f = 0;
    public final c0 d = new c0(Looper.getMainLooper(), 0);

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
            nVar2.m(this.c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                androidx.activity.i iVar = this.h;
                if (iVar != null) {
                    this.d.removeCallbacks(iVar);
                }
                androidx.activity.i iVar2 = new androidx.activity.i(this, 20);
                this.h = iVar2;
                this.d.postDelayed(iVar2, this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i10, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j3) {
        boolean z10;
        synchronized (i) {
            long j10 = this.e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
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
                    n6.l.h(nVar);
                    nVar.s(this.c, this.e, i10, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    androidx.activity.i iVar = this.h;
                    if (iVar != null) {
                        this.d.removeCallbacks(iVar);
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
