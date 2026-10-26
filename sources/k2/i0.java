package k2;

import android.os.Handler;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
