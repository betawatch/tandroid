package l5;

import i2.o1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
