package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.v1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e0 implements h5.n {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public e0(ag.d dVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = dVar;
    }

    @Override // h5.n
    public void a(v1 v1Var) {
        if (this.a) {
            b(e());
        }
        this.e = v1Var;
    }

    public void b(long j10) {
        this.b = j10;
        if (this.a) {
            ((h5.y) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void c() {
        if (this.a) {
            return;
        }
        ((h5.y) this.d).getClass();
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // h5.n
    public v1 d() {
        return (v1) this.e;
    }

    @Override // h5.n
    public long e() {
        long j10 = this.b;
        if (!this.a) {
            return j10;
        }
        ((h5.y) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (((v1) this.e).a == 1.0f ? h5.d0.G(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    public e0(h5.y yVar) {
        this.d = yVar;
        this.e = v1.d;
    }
}
