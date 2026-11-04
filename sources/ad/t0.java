package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum t0 extends c2 {
    public t0() {
        super("Rcdata", 2);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        char i3 = aVar.i();
        if (i3 == 0) {
            mVar.m(this);
            aVar.a();
            mVar.f((char) 65533);
        } else {
            if (i3 == '&') {
                mVar.a(c2.d);
                return;
            }
            if (i3 == '<') {
                mVar.a(c2.s);
            } else if (i3 != 65535) {
                mVar.h(aVar.g('&', '<', 0));
            } else {
                mVar.g(new h());
            }
        }
    }
}
