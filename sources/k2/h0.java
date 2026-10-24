package k2;

import android.os.Handler;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class h0 {
    public final Handler a;
    public final g0 b;
    public final /* synthetic */ i0 c;

    public h0(i0 i0Var) {
        this.c = i0Var;
        Handler q6 = e2.m0.q(null);
        this.a = q6;
        g0 g0Var = new g0(this);
        this.b = g0Var;
        i0Var.a.registerStreamEventCallback(new i2.f0(q6, 1), g0Var);
    }

    public static void a(h0 h0Var) {
        h0Var.c.a.unregisterStreamEventCallback(h0Var.b);
        h0Var.a.removeCallbacksAndMessages(null);
    }
}
