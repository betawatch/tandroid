package n6;

import android.os.Bundle;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
