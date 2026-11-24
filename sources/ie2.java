// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ie2 implements ck6 {
    public long a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public final void a(long j) {
        this.a = j;
        if (this.c) {
            ((adb) this.d).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    @Override // ck6
    public final void b(zb8 zb8Var) {
        if (this.c) {
            a(h());
        }
        this.e = zb8Var;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        ((adb) this.d).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // ck6
    public final zb8 g() {
        return (zb8) this.e;
    }

    @Override // ck6
    public final long h() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((adb) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((zb8) this.e).a == 1.0f ? g8c.T(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    @Override // ck6
    public final boolean i() {
        return false;
    }
}
