package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u1 implements x0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public u1(org.telegram.ui.web.h1 h1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = h1Var;
    }

    @Override // i2.x0
    public long a() {
        long j10 = this.a;
        if (!this.c) {
            return j10;
        }
        ((e2.g0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((b2.a1) this.e).a == 1.0f ? e2.n0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // i2.x0
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

    @Override // i2.x0
    public void f(b2.a1 a1Var) {
        if (this.c) {
            c(a());
        }
        this.e = a1Var;
    }

    @Override // i2.x0
    public b2.a1 h() {
        return (b2.a1) this.e;
    }

    public u1(e2.g0 g0Var) {
        this.d = g0Var;
        this.e = b2.a1.d;
    }
}
