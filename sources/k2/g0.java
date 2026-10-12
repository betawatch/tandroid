package k2;

import android.os.Handler;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g0 {
    public final Handler a;
    public final f0 b;
    public final /* synthetic */ h0 c;

    public g0(h0 h0Var) {
        this.c = h0Var;
        Handler q6 = e2.m0.q(null);
        this.a = q6;
        f0 f0Var = new f0(this);
        this.b = f0Var;
        h0Var.a.registerStreamEventCallback(new i2.f0(q6, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.c.a.unregisterStreamEventCallback(g0Var.b);
        g0Var.a.removeCallbacksAndMessages(null);
    }
}
