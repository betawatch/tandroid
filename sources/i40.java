// default package

import android.os.Handler;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i40 {
    public final Handler a;
    public final h40 b;
    public final /* synthetic */ j40 c;

    public i40(j40 j40Var) {
        this.c = j40Var;
        Handler q = g8c.q(null);
        this.a = q;
        h40 h40Var = new h40(this);
        this.b = h40Var;
        j40Var.a.registerStreamEventCallback(new g40(q, (byte) 0), h40Var);
    }

    public final void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
