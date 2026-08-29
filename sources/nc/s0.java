package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else {
            if (i10 == '&') {
                lVar.a(b2.d);
                return;
            }
            if (i10 == '<') {
                lVar.a(b2.s);
            } else if (i10 != 65535) {
                lVar.g(aVar.g('&', '<', 0));
            } else {
                lVar.h(new g());
            }
        }
    }
}
