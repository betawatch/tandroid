package gb;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class s implements ib.b {
    public final /* synthetic */ int a = 0;
    public final ib.c b;
    public final d9.o c;

    public s(ib.c cVar, d9.o oVar) {
        this.b = cVar;
        this.c = oVar;
    }

    @Override // fd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                Context appContext = (Context) this.c.a;
                id.h blockingDispatcher = (id.h) this.b.get();
                kotlin.jvm.internal.j.e(appContext, "appContext");
                kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
                return q.a(jb.j.a, new h9.g1(new o(0), 13), zd.b0.b(blockingDispatcher), new p(appContext, 0));
            default:
                return new jb.f((b) this.b.get(), (id.h) this.c.a);
        }
    }

    public s(d9.o oVar, ib.c cVar) {
        this.c = oVar;
        this.b = cVar;
    }
}
