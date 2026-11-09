package gb;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class e0 implements ib.b {
    public final /* synthetic */ int a = 0;
    public final ib.c b;
    public final d9.o c;

    public e0(d9.o oVar, ib.c cVar) {
        this.c = oVar;
        this.b = cVar;
    }

    @Override // fd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new d0((Context) this.c.a, (k1) this.b.get());
            default:
                return new jb.f((b) this.b.get(), (id.h) this.c.a);
        }
    }

    public e0(ib.c cVar, d9.o oVar) {
        this.b = cVar;
        this.c = oVar;
    }
}
