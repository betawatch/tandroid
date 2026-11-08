package l2;

import android.os.SystemClock;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class u1 implements w0 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    @Override // l2.w0
    public long a() {
        long j3 = this.a;
        if (!this.c) {
            return j3;
        }
        ((h2.g0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((e2.w0) this.e).a == 1.0f ? h2.m0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j3;
    }

    @Override // l2.w0
    public /* synthetic */ boolean b() {
        return false;
    }

    public void c(long j3) {
        this.a = j3;
        if (this.c) {
            ((h2.g0) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (this.c) {
            return;
        }
        ((h2.g0) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // l2.w0
    public void e(e2.w0 w0Var) {
        if (this.c) {
            c(a());
        }
        this.e = w0Var;
    }

    @Override // l2.w0
    public e2.w0 j() {
        return (e2.w0) this.e;
    }
}
