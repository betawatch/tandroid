package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class r1 implements t0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public r1(org.telegram.ui.web.u0 u0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = u0Var;
    }

    @Override // i2.t0
    public long a() {
        long j3 = this.a;
        if (!this.c) {
            return j3;
        }
        ((e2.x) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((b2.v0) this.e).a == 1.0f ? e2.d0.Q(elapsedRealtime) : elapsedRealtime * r4.c) + j3;
    }

    @Override // i2.t0
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

    @Override // i2.t0
    public void f(b2.v0 v0Var) {
        if (this.c) {
            c(a());
        }
        this.e = v0Var;
    }

    @Override // i2.t0
    public b2.v0 h() {
        return (b2.v0) this.e;
    }

    public r1(e2.x xVar) {
        this.d = xVar;
        this.e = b2.v0.d;
    }
}
