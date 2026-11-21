package h2;

import android.os.SystemClock;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class d0 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ e0 e;

    public d0(e0 e0Var, int i7) {
        this.e = e0Var;
        this.a = i7;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = (i0) e0Var.f;
        l2.f0 f0Var = (l2.f0) e0Var.a;
        int w02 = f0Var.w0();
        if (!f0Var.u() || f0Var.i() == 1 || f0Var.i() == 4 || w02 == 0 || w02 == 1) {
            if (this.c) {
                i0Var.e(4);
            }
            this.c = false;
            return;
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.c;
        int i7 = this.a;
        if (z10 && this.b == w02) {
            if (elapsedRealtime - this.d >= i7) {
                ((l2.z) e0Var.c).a.A1(new l2.l(2, new f0(4, i7), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = elapsedRealtime;
        this.b = w02;
        i0Var.e(4);
        i0Var.a.sendEmptyMessageDelayed(4, i7);
    }
}
