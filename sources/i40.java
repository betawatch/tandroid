// default package

import android.os.Handler;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
