package n2;

import android.os.Handler;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
