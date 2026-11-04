package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum b1 extends c2 {
    public b1() {
        super("Comment", 46);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        f fVar = mVar.n;
        char i3 = aVar.i();
        if (i3 == 0) {
            mVar.m(this);
            aVar.a();
            fVar.c.append((char) 65533);
        } else if (i3 == '-') {
            mVar.a(c2.l0);
        } else {
            if (i3 != 65535) {
                fVar.c.append(aVar.g('-', 0));
                return;
            }
            mVar.l(this);
            mVar.i();
            mVar.c = c2.a;
        }
    }
}
