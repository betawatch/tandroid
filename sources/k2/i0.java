package k2;

import android.os.Handler;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
