package n2;

import android.os.Handler;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
