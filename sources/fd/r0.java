package fd;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public enum r0 extends a2 {
    public r0() {
        super("Rcdata", 2);
    }

    @Override // fd.a2
    public final void d(k kVar, a aVar) {
        char i10 = aVar.i();
        if (i10 == 0) {
            kVar.m(this);
            aVar.a();
            kVar.f((char) 65533);
        } else {
            if (i10 == '&') {
                kVar.a(a2.d);
                return;
            }
            if (i10 == '<') {
                kVar.a(a2.s);
            } else if (i10 != 65535) {
                kVar.h(aVar.g('&', '<', 0));
            } else {
                kVar.g(new g());
            }
        }
    }
}
