package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class q1 implements s0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public q1(org.telegram.ui.web.r0 r0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = r0Var;
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
