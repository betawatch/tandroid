package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum a0 extends c2 {
    public a0() {
        super("ScriptDataEscaped", 21);
    }

    @Override // ad.c2
    public final void d(m mVar, a aVar) {
        if (aVar.j()) {
            mVar.l(this);
            mVar.c = c2.a;
            return;
        }
        char i3 = aVar.i();
        if (i3 == 0) {
            mVar.m(this);
            aVar.a();
            mVar.f((char) 65533);
        } else if (i3 == '-') {
            mVar.f('-');
            mVar.a(c2.M);
        } else if (i3 != '<') {
            mVar.h(aVar.g('-', '<', 0));
        } else {
            mVar.a(c2.O);
        }
    }
}
