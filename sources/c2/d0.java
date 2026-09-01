package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.v1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d0 implements h5.n {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public d0(ag.e eVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = eVar;
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
