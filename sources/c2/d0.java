package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import h3.x1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 implements d5.o {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public d0(af.e eVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = eVar;
    }

    public void a(long j10) {
        this.b = j10;
        if (this.a) {
            ((d5.a0) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.a) {
            return;
        }
        ((d5.a0) this.d).getClass();
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // d5.o
    public x1 getPlaybackParameters() {
        return (x1) this.e;
    }

    @Override // d5.o
    public long getPositionUs() {
        long j10 = this.b;
        if (!this.a) {
            return j10;
        }
        ((d5.a0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (((x1) this.e).a == 1.0f ? d5.f0.H(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // d5.o
    public void setPlaybackParameters(x1 x1Var) {
        if (this.a) {
            a(getPositionUs());
        }
        this.e = x1Var;
    }

    public d0(d5.a0 a0Var) {
        this.d = a0Var;
        this.e = x1.d;
    }
}
