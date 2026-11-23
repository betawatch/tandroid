package j6;

import android.os.Looper;
import java.util.Locale;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p {
    public static final Object i = new Object();
    public final b a;
    public final long b;
    public final String c;
    public o g;
    public i6.g h;
    public long e = -1;
    public long f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.b = j3;
        this.c = str;
        this.a = new b("RequestTracker", str);
    }

    public final void a(long j3, o oVar) {
        o oVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            oVar2 = this.g;
            j10 = this.e;
            j11 = this.f;
            this.e = j3;
            this.g = oVar;
            this.f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.C(this.c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                i6.g gVar = this.h;
                if (gVar != null) {
                    this.d.removeCallbacks(gVar);
                }
                i6.g gVar2 = new i6.g(this, 1);
                this.h = gVar2;
                this.d.postDelayed(gVar2, this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, m mVar) {
        synchronized (i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i7, mVar);
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

    public final void e(String str, int i7, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.g;
                    q6.m.h(oVar);
                    oVar.Z(this.c, this.e, i7, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    i6.g gVar = this.h;
                    if (gVar != null) {
                        this.d.removeCallbacks(gVar);
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
