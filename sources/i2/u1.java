package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.Components.voip.m2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class u1 implements w0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public u1(m2 m2Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = m2Var;
    }

    @Override // i2.w0
    public long a() {
        long j10 = this.a;
        if (!this.c) {
            return j10;
        }
        ((e2.g0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((b2.a1) this.e).a == 1.0f ? e2.m0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // i2.w0
    public /* synthetic */ boolean b() {
        return false;
    }

    public void c(long j10) {
        this.a = j10;
        if (this.c) {
            ((e2.g0) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (this.c) {
            return;
        }
        ((e2.g0) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // i2.w0
    public void f(b2.a1 a1Var) {
        if (this.c) {
            c(a());
        }
        this.e = a1Var;
    }

    @Override // i2.w0
    public b2.a1 h() {
        return (b2.a1) this.e;
    }

    public u1(e2.g0 g0Var) {
        this.d = g0Var;
        this.e = b2.a1.d;
    }
}
