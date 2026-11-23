package l2;

import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class r1 implements u0 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    @Override // l2.u0
    public long a() {
        long j3 = this.a;
        if (!this.c) {
            return j3;
        }
        ((h2.g0) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((e2.w0) this.e).a == 1.0f ? h2.l0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j3;
    }

    @Override // l2.u0
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

    @Override // l2.u0
    public void e(e2.w0 w0Var) {
        if (this.c) {
            c(a());
        }
        this.e = w0Var;
    }

    @Override // l2.u0
    public e2.w0 l() {
        return (e2.w0) this.e;
    }
}
