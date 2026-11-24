// default package

import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i50 {
    public final Handler a;
    public final h50 b;
    public final /* synthetic */ j50 c;

    public i50(j50 j50Var) {
        this.c = j50Var;
        Handler q = hac.q(null);
        this.a = q;
        h50 h50Var = new h50(this);
        this.b = h50Var;
        j50Var.a.registerStreamEventCallback(new g50(q, (byte) 0), h50Var);
    }

    public final void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
