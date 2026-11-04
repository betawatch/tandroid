package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum a2 extends c2 {
    public a2() {
        super("TagOpen", 7);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char i3 = aVar.i();
        if (i3 == '!') {
            mVar.a(c2.h0);
            return;
        }
        if (i3 == '/') {
            mVar.a(c2.n);
            return;
        }
        if (i3 == '?') {
            mVar.a(c2.g0);
            return;
        }
        if (aVar.o()) {
            mVar.d(true);
            mVar.c = c2.r;
        } else {
            mVar.m(this);
            mVar.f('<');
            mVar.c = c2.a;
        }
    }
}
