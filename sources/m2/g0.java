package m2;

import android.os.Handler;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 {
    public final Handler a;
    public final f0 b;
    public final /* synthetic */ h0 c;

    public g0(h0 h0Var) {
        this.c = h0Var;
        Handler q10 = g2.n0.q(null);
        this.a = q10;
        f0 f0Var = new f0(this);
        this.b = f0Var;
        h0Var.a.registerStreamEventCallback(new k2.g0(q10, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.c.a.unregisterStreamEventCallback(g0Var.b);
        g0Var.a.removeCallbacksAndMessages(null);
    }
}
