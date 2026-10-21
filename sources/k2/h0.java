package k2;

import android.os.Handler;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        i0Var.a.registerStreamEventCallback(new i2.g0(q6, 1), g0Var);
    }

    public static void a(h0 h0Var) {
        h0Var.c.a.unregisterStreamEventCallback(h0Var.b);
        h0Var.a.removeCallbacksAndMessages(null);
    }
}
