// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class n4d {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ gg0 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ gg0 f;

    public n4d(gg0 gg0Var, int i, Bundle bundle) {
        this.f = gg0Var;
        Boolean bool = Boolean.TRUE;
        this.c = gg0Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ds2 ds2Var);

    public final void c() {
        d();
        gg0 gg0Var = this.c;
        synchronized (gg0Var.q) {
            gg0Var.q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
