package n2;

import android.os.Handler;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class f0 {
    public final Handler a;
    public final e0 b;
    public final /* synthetic */ g0 c;

    public f0(g0 g0Var) {
        this.c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.a = q10;
        e0 e0Var = new e0(this);
        this.b = e0Var;
        g0Var.a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.c.a.unregisterStreamEventCallback(f0Var.b);
        f0Var.a.removeCallbacksAndMessages(null);
    }
}
