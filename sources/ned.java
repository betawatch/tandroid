// default package

import android.os.Looper;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ned {
    public static final Object i = new Object();
    public final he6 a;
    public final int b;
    public final String c;
    public ydd g;
    public bva h;
    public long e = -1;
    public long f = 0;
    public final b99 d = new b99(Looper.getMainLooper(), (byte) 3);

    public ned(long j, String str) {
        this.b = (int) j;
        this.c = str;
        this.a = new he6("RequestTracker", str);
    }

    public final void a(long j, ydd yddVar) {
        ydd yddVar2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            yddVar2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = yddVar;
            this.f = currentTimeMillis;
        }
        if (yddVar2 != null) {
            yddVar2.t0(this.c, j2, j3, currentTimeMillis);
        }
        synchronized (obj) {
            bva bvaVar = this.h;
            if (bvaVar != null) {
                this.d.removeCallbacks(bvaVar);
            }
            bva bvaVar2 = new bva((Object) this, (byte) 26);
            this.h = bvaVar2;
            this.d.postDelayed(bvaVar2, this.b);
        }
    }

    public final void b(long j, int i2, kdd kddVar) {
        synchronized (i) {
            if (c(j)) {
                Locale locale = Locale.ROOT;
                e(i2, kddVar, "request " + j + " completed");
            }
        }
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (i) {
            z = this.e != -1;
        }
        return z;
    }

    public final void e(int i2, kdd kddVar, String str) {
        this.a.b(str, new Object[0]);
        Object obj = i;
        synchronized (obj) {
            if (this.g != null) {
                long currentTimeMillis = System.currentTimeMillis();
                ydd yddVar = this.g;
                xve.h(yddVar);
                yddVar.b0(this.c, this.e, i2, kddVar, this.f, currentTimeMillis);
            }
            this.e = -1L;
            this.g = null;
            synchronized (obj) {
                try {
                    bva bvaVar = this.h;
                    if (bvaVar != null) {
                        this.d.removeCallbacks(bvaVar);
                        this.h = null;
                    }
                } finally {
                }
            }
        }
    }

    public final boolean f(int i2) {
        synchronized (i) {
            if (!d()) {
                return false;
            }
            Locale locale = Locale.ROOT;
            e(i2, null, "clearing request " + this.e);
            return true;
        }
    }
}
