package l5;

import i2.o1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class d implements ja.d {
    public static final d a = new d();
    public static final ja.c b = new ja.c("logSource", o1.p(o1.o(ma.e.class, new ma.a(1))));
    public static final ja.c c = new ja.c("logEventDropped", o1.p(o1.o(ma.e.class, new ma.a(2))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ja.e eVar2 = (ja.e) obj2;
        eVar2.d(b, eVar.a);
        eVar2.d(c, eVar.b);
    }
}
