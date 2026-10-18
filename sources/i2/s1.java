package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class s1 implements v0 {
    public long a;
    public long b;
    public boolean c;
    public final Object d;
    public Object e;

    public s1(a2 a2Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = a2Var;
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
