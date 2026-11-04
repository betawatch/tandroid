package db;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 implements fb.b {
    public final /* synthetic */ int a = 0;
    public final fb.c b;
    public final e.a c;

    public d0(e.a aVar, fb.c cVar) {
        this.c = aVar;
        this.b = cVar;
    }

    @Override // cd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c0((Context) this.c.a, (j1) this.b.get());
            default:
                return new gb.f((b) this.b.get(), (fd.h) this.c.a);
        }
    }

    public d0(fb.c cVar, e.a aVar) {
        this.b = cVar;
        this.c = aVar;
    }
}
