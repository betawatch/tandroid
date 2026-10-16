package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.Components.voip.r2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class u1 implements w0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public u1(r2 r2Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = r2Var;
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
