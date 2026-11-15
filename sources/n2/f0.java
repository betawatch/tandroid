package n2;

import android.os.Handler;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
