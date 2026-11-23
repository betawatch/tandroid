package gb;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class t implements ib.b {
    public final /* synthetic */ int a = 0;
    public final ib.c b;
    public final e.a c;

    public t(ib.c cVar, e.a aVar) {
        this.b = cVar;
        this.c = aVar;
    }

    @Override // fd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                Context appContext = (Context) this.c.a;
                id.h blockingDispatcher = (id.h) this.b.get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                return q.a(jb.j.a, new j6.r(new o(0), 9), zd.b0.b(blockingDispatcher), new p(appContext, 0));
            default:
                return new jb.f((b) this.b.get(), (id.h) this.c.a);
        }
    }

    public t(e.a aVar, ib.c cVar) {
        this.c = aVar;
        this.b = cVar;
    }
}
