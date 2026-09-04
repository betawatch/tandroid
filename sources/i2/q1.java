package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class q1 implements s0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public q1(org.telegram.ui.web.b bVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = bVar;
    }

    @Override // i2.s0
    public long a() {
        long j3 = this.a;
        if (!this.c) {
            return j3;
        }
        ((e2.x) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((b2.v0) this.e).a == 1.0f ? e2.d0.Q(elapsedRealtime) : elapsedRealtime * r4.c) + j3;
    }

    @Override // i2.s0
    public /* synthetic */ boolean b() {
        return false;
    }

    public void c(long j3) {
        this.a = j3;
        if (this.c) {
            ((e2.x) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (this.c) {
            return;
        }
        ((e2.x) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // i2.s0
    public void f(b2.v0 v0Var) {
        if (this.c) {
            c(a());
        }
        this.e = v0Var;
    }

    @Override // i2.s0
    public b2.v0 h() {
        return (b2.v0) this.e;
    }

    public q1(e2.x xVar) {
        this.d = xVar;
        this.e = b2.v0.d;
    }
}
