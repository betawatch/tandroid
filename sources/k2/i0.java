package k2;

import android.os.Handler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i0 {
    public final Handler a;
    public final h0 b;
    public final /* synthetic */ j0 c;

    public i0(j0 j0Var) {
        this.c = j0Var;
        Handler q6 = e2.l0.q(null);
        this.a = q6;
        h0 h0Var = new h0(this);
        this.b = h0Var;
        j0Var.a.registerStreamEventCallback(new i2.g0(q6, 1), h0Var);
    }

    public static void a(i0 i0Var) {
        i0Var.c.a.unregisterStreamEventCallback(i0Var.b);
        i0Var.a.removeCallbacksAndMessages(null);
    }
}
