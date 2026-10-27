package k2;

import android.os.Handler;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i0 {
    public final Handler a;
    public final h0 b;
    public final /* synthetic */ j0 c;

    public i0(j0 j0Var) {
        this.c = j0Var;
        Handler q5 = e2.n0.q(null);
        this.a = q5;
        h0 h0Var = new h0(this);
        this.b = h0Var;
        j0Var.a.registerStreamEventCallback(new i2.h0(q5, 1), h0Var);
    }

    public static void a(i0 i0Var) {
        i0Var.c.a.unregisterStreamEventCallback(i0Var.b);
        i0Var.a.removeCallbacksAndMessages(null);
    }
}
