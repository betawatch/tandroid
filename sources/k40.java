// default package

import android.os.Handler;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k40 {
    public final Handler a;
    public final j40 b;
    public final /* synthetic */ l40 c;

    public k40(l40 l40Var) {
        this.c = l40Var;
        Handler q = gcc.q(null);
        this.a = q;
        j40 j40Var = new j40(this);
        this.b = j40Var;
        l40Var.a.registerStreamEventCallback(new i40(q, (byte) 0), j40Var);
    }

    public final void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
