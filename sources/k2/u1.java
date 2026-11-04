package k2;

import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u1 implements w0 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    @Override // k2.w0
    public long a() {
        long j10 = this.a;
        if (!this.c) {
            return j10;
        }
        ((g2.h0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((d2.y0) this.e).a == 1.0f ? g2.n0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // k2.w0
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // k2.w0
    public void c(d2.y0 y0Var) {
        if (this.c) {
            d(a());
        }
        this.e = y0Var;
    }

    public void d(long j10) {
        this.a = j10;
        if (this.c) {
            ((g2.h0) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void e() {
        if (this.c) {
            return;
        }
        ((g2.h0) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // k2.w0
    public d2.y0 g() {
        return (d2.y0) this.e;
    }
}
