package k2;

import android.os.Handler;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
