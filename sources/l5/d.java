package l5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d implements ia.d {
    public static final d a = new d();
    public static final ia.c b = new ia.c("logSource", hc.b.p(hc.b.o(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("logEventDropped", hc.b.p(hc.b.o(la.e.class, new la.a(2))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ia.e eVar2 = (ia.e) obj2;
        eVar2.a(b, eVar.a);
        eVar2.a(c, eVar.b);
    }
}
