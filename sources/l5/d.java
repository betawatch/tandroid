package l5;

import i2.o1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
