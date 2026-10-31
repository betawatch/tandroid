package i2;

import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w1 implements x0 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    @Override // i2.x0
    public long a() {
        long j10 = this.a;
        if (!this.c) {
            return j10;
        }
        ((e2.g0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((b2.z0) this.e).a == 1.0f ? e2.l0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // i2.x0
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // i2.x0
    public void c(b2.z0 z0Var) {
        if (this.c) {
            d(a());
        }
        this.e = z0Var;
    }

    public void d(long j10) {
        this.a = j10;
        if (this.c) {
            ((e2.g0) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void e() {
        if (this.c) {
            return;
        }
        ((e2.g0) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // i2.x0
    public b2.z0 g() {
        return (b2.z0) this.e;
    }
}
