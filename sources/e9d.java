// default package

import android.os.Bundle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class e9d {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ hg0 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ hg0 f;

    public e9d(hg0 hg0Var, int i, Bundle bundle) {
        this.f = hg0Var;
        Boolean bool = Boolean.TRUE;
        this.c = hg0Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ws2 ws2Var);

    public final void c() {
        d();
        hg0 hg0Var = this.c;
        synchronized (hg0Var.q) {
            hg0Var.q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
