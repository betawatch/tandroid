package n6;

import android.os.Bundle;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class w {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ g c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ g f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f = gVar;
        Boolean bool = Boolean.TRUE;
        this.c = gVar;
        this.a = bool;
        this.b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.c.G) {
            this.c.G.remove(this);
        }
    }
}
