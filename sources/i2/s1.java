package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.z1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class s1 implements v0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public s1(z1 z1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = z1Var;
    }

    @Override // i2.v0
    public long a() {
        long j10 = this.a;
        if (!this.c) {
            return j10;
        }
        ((e2.g0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((b2.z0) this.e).a == 1.0f ? e2.m0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // i2.v0
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

    @Override // i2.v0
    public void f(b2.z0 z0Var) {
        if (this.c) {
            c(a());
        }
        this.e = z0Var;
    }

    @Override // i2.v0
    public b2.z0 h() {
        return (b2.z0) this.e;
    }

    public s1(e2.g0 g0Var) {
        this.d = g0Var;
        this.e = b2.z0.d;
    }
}
