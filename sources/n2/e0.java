package n2;

import android.os.Handler;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e0 {
    public final Handler a;
    public final d0 b;
    public final /* synthetic */ f0 c;

    public e0(f0 f0Var) {
        this.c = f0Var;
        Handler q10 = h2.m0.q(null);
        this.a = q10;
        d0 d0Var = new d0(this);
        this.b = d0Var;
        f0Var.a.registerStreamEventCallback(new l2.g0(q10, 1), d0Var);
    }

    public static void a(e0 e0Var) {
        e0Var.c.a.unregisterStreamEventCallback(e0Var.b);
        e0Var.a.removeCallbacksAndMessages(null);
    }
}
