package e2;

import android.os.SystemClock;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class d0 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ e0 e;

    public d0(e0 e0Var, int i10) {
        this.e = e0Var;
        this.a = i10;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = e0Var.f;
        i2.i0 i0Var2 = e0Var.a;
        int w02 = i0Var2.w0();
        if (!i0Var2.t() || i0Var2.d() == 1 || i0Var2.d() == 4 || w02 == 0 || w02 == 1) {
            if (this.c) {
                i0Var.e(4);
            }
            this.c = false;
            return;
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.c;
        int i10 = this.a;
        if (z10 && this.b == w02) {
            if (elapsedRealtime - this.d >= i10) {
                e0Var.c.a.A1(new i2.n(2, new f0(4, i10), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = elapsedRealtime;
        this.b = w02;
        i0Var.e(4);
        i0Var.a.sendEmptyMessageDelayed(4, i10);
    }
}
