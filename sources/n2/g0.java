package n2;

import android.os.Handler;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g0 {
    public final Handler a;
    public final f0 b;
    public final /* synthetic */ h0 c;

    public g0(h0 h0Var) {
        this.c = h0Var;
        Handler q10 = h2.l0.q(null);
        this.a = q10;
        f0 f0Var = new f0(this);
        this.b = f0Var;
        h0Var.a.registerStreamEventCallback(new l2.e0(q10, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.c.a.unregisterStreamEventCallback(g0Var.b);
        g0Var.a.removeCallbacksAndMessages(null);
    }
}
