package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.v1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d0 implements h5.n {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public d0(ag.d dVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = dVar;
    }

    public void a(long j10) {
        this.b = j10;
        if (this.a) {
            ((h5.y) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.a) {
            return;
        }
        ((h5.y) this.d).getClass();
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // h5.n
    public void c(v1 v1Var) {
        if (this.a) {
            a(e());
        }
        this.e = v1Var;
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

    public d0(h5.y yVar) {
        this.d = yVar;
        this.e = v1.d;
    }
}
